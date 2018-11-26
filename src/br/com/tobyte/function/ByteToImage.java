package br.com.tobyte.function;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Thiago
 */
public class ByteToImage implements br.com.tobyte.basic.ByteToImage {

    @Override
    public BufferedImage createImage(byte[] image) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new ByteArrayInputStream(image));
        } catch (IOException ex) {
            Logger.getLogger(ByteToImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return img;
    }

}
