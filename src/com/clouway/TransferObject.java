package com.clouway;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TransferObject {
    public TransferObject() {
    }

    /**
     * Transfers set amount of bytes from inputStream to outputStream
     * @param inp inputStream as data source
     * @param out outputStream where data is being transfered
     * @param offset how many initial bytes to skip from inputStream
     * @param size how many bytes after offset to transfer to outputStream
     * @throws IOException
     */
    public void transfer(BufferedInputStream inp, OutputStream out, int offset, int size) throws IOException {
        int lastBytes = size;
        int howManyKBytes = 0;
        if(size>1024) {
            howManyKBytes = size / 1024;
            lastBytes -= howManyKBytes * 1024;
        }

        byte [] bytes = new byte[1024];
        inp.skip(offset);

        int read = inp.read(bytes);
        for (int i = 0 ; i < howManyKBytes ; i++) {
            out.write(bytes,0,read);
            read = inp.read(bytes);
        }
        out.write(bytes,0,lastBytes);
    }
}
