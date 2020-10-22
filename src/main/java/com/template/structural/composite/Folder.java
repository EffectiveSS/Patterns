package com.template.structural.composite;

import java.util.HashSet;
import java.util.Set;

public class Folder extends FileFolder  {

    private final Set<FileFolder> filesFolders = new HashSet<>();

    public Folder(String name) {
        super(name + '/');
    }

    public boolean add(FileFolder fileFolder) {
        return filesFolders.add(fileFolder);
    }

    public boolean removeFileFolder(FileFolder fileFolder) {
        return filesFolders.remove(fileFolder);
    }

    @Override
    void read() {
        System.out.println("File content " + getName());
        filesFolders.forEach(FileFolder::read);
        System.out.println("End of " + getName());
    }

}
