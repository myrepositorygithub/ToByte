package br.com.tobyte.function;

import br.com.tobyte.basic.WriteToByteArray;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class CreateToByteArray implements WriteToByteArray {

    @Override
    public byte[] formatToByte(List<String> elements) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(baos);
        for (String element : elements) {
            out.writeUTF(element);
        }
        return baos.toByteArray();
    }

}
