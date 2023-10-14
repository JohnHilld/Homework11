package package1;

import java.util.Comparator;

public class FileSizeComparator implements Comparator<FileData> {
    @Override
    public int compare(FileData o1, FileData o2) {
        if (o1.getSizeInBytes() == o2.getSizeInBytes()) {
            return 0;
        } else if (o1.getSizeInBytes() > o2.getSizeInBytes()) {
            return 1;
        } else {
            return -1;
        }
    }
}
