package com.clouway;

import java.io.*;

public class DataClass {
    public DataClass() {
    }

    public void saveObject(OutputStream outputStream, Object object) throws IOException {
        new ObjectOutputStream(outputStream).writeObject(object);
    }

    public Object getObject(InputStream inputStream) throws IOException, ClassNotFoundException {
            return new ObjectInputStream(inputStream).readObject();
    }
}
