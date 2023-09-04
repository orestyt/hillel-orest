package homework9;

public class FileData {
    private final String fileName;
    private final int fileByte;
    private final String filePath;

    public String getFileName() {
        return fileName;
    }

    public int getFileByte() {
        return fileByte;
    }

    public String getFilePath() {
        return filePath;
    }

    public FileData(String fileName, int fileByte, String filePath) {
        this.fileName = fileName;
        this.fileByte = fileByte;
        this.filePath = filePath;
    }
}
