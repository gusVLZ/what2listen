package br.usjt.what2listen.View;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Components {
    public static JButton button(String text, int style){
        JButton btn = new JButton(text);
        switch(style){
            case 1:{
                break;
            }
        }

        return btn;
    }

    
    public static JLabel title(String text, int style, int fontSize){
        JLabel ret = new JLabel(text, JLabel.CENTER);
        ret.setFont(new Font("Arial", style, fontSize));
        return ret;
    }
}
