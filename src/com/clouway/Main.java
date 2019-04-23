package com.clouway;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Path textFileDir = Paths.get("/home/clouway/clouway/workspaces/idea/TextFilesDir/");
        FileLinesDataSource flds = new FileLinesDataSource(textFileDir.resolve("copyFileContext.txt"));
        new FileReverser().reverse(textFileDir.resolve("copyFileContext.txt"),flds);

        try {
            System.out.println(new ConsoleReader().readFloat());
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        try {
            System.out.println(new ConsoleReader().readInt());
        } catch (NumberFormatException e){
            e.printStackTrace();
        }



        DataClass dataClass = new DataClass();
        Path dataStream = textFileDir.resolve("dataStream.txt");
        OutputStream dataOutput = null;
        InputStream dataInput = null;
        try {
            dataOutput = new FileOutputStream(dataStream.toString());
            dataInput = new FileInputStream(dataStream.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<Integer> retrievedIntegers = new LinkedList<>();
        List<Integer> integers = new LinkedList<>();
        for(int i = 0 ; i < 10 ; i++) {
            integers.add(i);
        }


        try {
            dataClass.saveObject(dataOutput,integers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            retrievedIntegers = (List<Integer>) dataClass.getObject(dataInput);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Dog dog = new Dog("dog","dogbreed", 12);
        Dog retrievedDog = new Dog();
        try {
            dataClass.saveObject(dataOutput,dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            retrievedDog = (Dog) dataClass.getObject(dataInput);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(retrievedIntegers);
        System.out.println(retrievedDog);

        //transfer object

        Path inpStream = textFileDir.resolve("input.txt");
        Path outStream = textFileDir.resolve("output.txt");

        try {
            OutputStream outputStream = new FileOutputStream(outStream.toString());
            BufferedInputStream buff = new BufferedInputStream(new FileInputStream(inpStream.toString()));
            try {
                new TransferObject().transfer(buff, outputStream, 2, 3000);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
