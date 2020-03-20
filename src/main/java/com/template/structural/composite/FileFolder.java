package com.template.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FileFolder {
    private final boolean TRUE = true;
    private final boolean FALSE = false;
    private String name;

    private List<FileFolder> fileFolders;
    private List<File> files;

    public FileFolder(String name) {
        this.name = name;
        fileFolders = new ArrayList<>();
        files = new ArrayList<>();
    }

    public boolean addFileFolder(FileFolder fileFolder) {
        if (fileFolders.stream().noneMatch(elem -> elem == fileFolder)) {
            fileFolders.add(fileFolder);
            return TRUE;
        }
        return FALSE;
    }

    public boolean addFile(File file) {
        if (files.stream().noneMatch(elem -> elem == file)) {
            files.add(file);
            return TRUE;
        }
        return FALSE;
    }

    public boolean removeFileFolder(FileFolder fileFolder) {
        return fileFolders.remove(fileFolder);
    }

    public boolean removeFile(File file) {
        return files.remove(file);
    }

    public String getName() {
        return name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setName(String name) {
        this.name = name;
    }
}
