package com.clouway;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileLinesDataSource implements LinesDataSource{
    Path path;

    public FileLinesDataSource(Path path) {
        this.path = path;
    }

    @Override
    public List<String> getLines() {
        try {
            List<String> lines = Files.readAllLines(path);
            return lines;
        } catch (IOException e) {
            throw new RuntimeException(String.format("Unable to read from %s due:%s", path, e.getCause()));
        }
    }
}
