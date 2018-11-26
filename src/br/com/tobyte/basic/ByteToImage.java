package br.com.tobyte.basic;

import java.awt.image.BufferedImage;

/**
 *
 * @author Thiago
 */
public interface ByteToImage {

    public abstract BufferedImage createImage(byte[] image);
}
