package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class FileNavigator {
    TreeMap<String, List<FileData>> fileSystem;

    public FileNavigator() {
        fileSystem = new TreeMap<>();
    }

    public void add(String path, FileData data) throws IllegalPathException {
        if(!data.getFilePath().equals(path)) {
            throw new IllegalPathException(path, data);
        }

        List<FileData> fileDataList = fileSystem.get(path);

        if(fileDataList == null) {
            fileDataList = new ArrayList<FileData>();
            fileSystem.put(path, fileDataList);
        }

        fileDataList.add(data);
    }

    public List<FileData> find(String path) {
        if(fileSystem.containsKey(path)) {
            return fileSystem.get(path);
        } else {
            return new ArrayList<>();
        }
    }

    public  List<FileData> filterBySize(int fileSize) {
        List<FileData> filesLessThan = new ArrayList<>();
        for (List<FileData> listFiles: fileSystem.values()) {
            for (FileData file: listFiles) {
                if(file.getSizeInBytes() <= fileSize) {
                    filesLessThan.add(file);
                }
            }
        }
        return filesLessThan;
    }

    public void remove(String path) {
        fileSystem.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortedFiles = new ArrayList<>();
        for (List<FileData> listFiles: fileSystem.values()) {
            for (FileData file: listFiles) {
                sortedFiles.add(file);
            }
        }
        Collections.sort(sortedFiles, new FileSizeComparator());
        return sortedFiles;
    }
}
