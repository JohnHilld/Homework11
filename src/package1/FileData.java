package package1;

public class FileData {
    private String fileName;
    private int sizeInBytes;
    private String filePath;

    public FileData(String fileName, int sizeInBytes, String filePath) {
        this.fileName = fileName;
        this.sizeInBytes = sizeInBytes;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", sizeInBytes=" + sizeInBytes +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
