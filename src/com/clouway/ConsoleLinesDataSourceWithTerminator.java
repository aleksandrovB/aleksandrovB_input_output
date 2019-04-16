package com.clouway;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ConsoleLinesDataSourceWithTerminator implements LinesDataSource {
    String terminationString;

    public ConsoleLinesDataSourceWithTerminator(String terminationString) {
        this.terminationString = terminationString;
    }

    @Override
    public List<String> getLines() {
        Scanner scan = new Scanner(System.in);
        List<String> data = new LinkedList<>();
        String consoleLine = scan.nextLine();
        while (!consoleLine.equals(terminationString)){
            data.add(consoleLine);
            consoleLine = scan.nextLine();
        }
        return data;
    }
}
