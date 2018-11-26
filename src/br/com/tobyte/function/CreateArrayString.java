package br.com.tobyte.function;

import br.com.tobyte.basic.ReadFromByteArray;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class CreateArrayString implements ReadFromByteArray {

    @Override
    public List<String> formatToList(byte[] bytes) throws IOException {
        List<String> elements = new ArrayList<>();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        DataInputStream in = new DataInputStream(bais);
        while (in.available() > 0) {
            elements.add(in.readUTF());
        }
        return elements;
    }

}
