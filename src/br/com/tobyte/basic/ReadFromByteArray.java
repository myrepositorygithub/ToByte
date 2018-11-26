package br.com.tobyte.basic;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Thiago
 */
public interface ReadFromByteArray {

    public abstract List<String> formatToList(byte[] bytes) throws IOException;
}
