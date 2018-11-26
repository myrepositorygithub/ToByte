package br.com.tobyte.function;

import br.com.tobyte.basic.ImageToByte;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Thiago
 */
public class ImageToByteArray implements ImageToByte {

    @Override
    public byte[] imageToByte(String image) throws IOException {
        byte[] buffer;
        try (InputStream is = new FileInputStream(image)) {
            buffer = new byte[is.available()];
            is.read(buffer);
        }
        return buffer;
    }

}
