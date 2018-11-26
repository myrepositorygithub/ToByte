package br.com.tobyte.basic;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Thiago
 */
public interface WriteToByteArray {

    public abstract byte[] formatToByte(List<String> elements) throws IOException;
}
