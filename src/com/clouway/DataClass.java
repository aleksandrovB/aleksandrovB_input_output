package com.clouway;

import java.io.*;

public class DataClass {
    public DataClass() {
    }

    /**
     * Serializes and adds object in outputStream
     * @param outputStream stream where object is saved
     * @param object object being saved
     * @throws IOException Any exception thrown by the underlying OutputStream
     */
    public void saveObject(OutputStream outputStream, Object object) throws IOException {
        new ObjectOutputStream(outputStream).writeObject(object);
    }

    /**
     * Read object from inputStream
     * @param inputStream data origin
     * @return object from inputStream
     * @throws IOException Any of the usual Input/Output related exceptions
     * @throws ClassNotFoundException Class of a serialized object cannot be found
     */
    public Object getObject(InputStream inputStream) throws IOException, ClassNotFoundException {
            return new ObjectInputStream(inputStream).readObject();
    }
}
