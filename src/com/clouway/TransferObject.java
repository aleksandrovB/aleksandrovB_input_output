package com.clouway;

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
    public void transfer(InputStream inp, OutputStream out, int offset, int size) throws IOException {
        byte[] b = new byte[size];
        inp.skip(offset);
        inp.read(b,0,size);
        out.write(b);
    }
}
