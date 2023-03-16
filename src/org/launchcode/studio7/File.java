package org.launchcode.studio7;

public class File {
    // FIELDS
    // initialize fields - all final because they are only set once and don't need to be inherited or extended
    private final String name;
    private final int size;
    private final String fileType;

    // CONSTRUCTORS
    // generate constructor
    public File(String name, int size, String fileType) {
        this.name = name;
        this.size = size;
        this.fileType = fileType;
    }

    // TOSTRING METHOD
    @Override
    public String toString() {
        return name + " - " + size + " MB\n";
    }

    // GETTERS
    // generate getters
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getFileType() {
        return fileType;
    }
}
