package br.com.tobyte.basic;

import java.io.IOException;

/**
 *
 * @author Thiago
 */
public interface ImageToByte {
    public abstract byte[] imageToByte(String image) throws IOException;
}
