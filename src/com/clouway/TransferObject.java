package com.clouway;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TransferObject {
    public void transfer(InputStream inp, OutputStream out, int offset, int size) throws IOException {
        byte[] b = new byte[size];
        inp.skip(offset);
        inp.read(b,0,size);
        out.write(b);
    }
}
