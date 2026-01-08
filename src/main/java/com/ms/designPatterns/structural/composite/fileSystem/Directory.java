package com.ms.designPatterns.structural.composite.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    private String name;
    List<FileSystem> fileSystemList;

    public Directory(String name) {
        this.name = name;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println(name);

        for (FileSystem fs: fileSystemList) {
            fs.ls();
        }
    }
}
