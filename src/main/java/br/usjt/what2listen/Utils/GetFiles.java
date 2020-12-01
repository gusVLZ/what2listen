package br.usjt.what2listen.Utils;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class GetFiles {
    public static Image getImage(final String pathAndFileName) {
        final URL url = Thread.currentThread().getContextClassLoader().getResource(pathAndFileName);
        return Toolkit.getDefaultToolkit().getImage(url);
    }
}
