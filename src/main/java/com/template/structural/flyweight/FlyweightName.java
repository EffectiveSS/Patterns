package com.template.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightName {
    public static final FlyweightName fwn = new FlyweightName();
    private final Map<String, File> unique;

    private FlyweightName() {
        unique = new HashMap<>();
    }

    public File isName(String name) {
        File file = unique.get(name);

        if (file == null) {
            file = new File(name);
            unique.put(name, file);
        }

        return file;
    }
}
