package com.clouway;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReverser {
    public FileReverser() {
    }

    public void reverse(Path path, LinesDataSource linesDataSource){
        List<String> lines = linesDataSource.getLines();
        String tempLine;
        for (int i = 0; i < lines.size()/2; i++) {
            int mirror = lines.size()-1-i;
            tempLine = lines.get(i);
            lines.set(i,lines.get(mirror));
            lines.set(mirror, tempLine);
        }
        try {
            Files.write(path,lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
