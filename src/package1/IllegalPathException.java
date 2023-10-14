package package1;

public class IllegalPathException extends Exception {
    private String path;
    private FileData file;

    public IllegalPathException(String path, FileData file) {
        this.path = path;
        this.file = file;
    }

    @Override
    public String toString() {
        return "Must be mistake, because the key-path and the file path do not match\n" +
                "path='" + path +
                "'\nFileData: {name: ..., size: ..., path:" + file.getFilePath() +
                '}';
    }
}
