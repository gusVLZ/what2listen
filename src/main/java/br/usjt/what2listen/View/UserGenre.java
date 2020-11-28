package br.usjt.what2listen.View;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.what2listen.Utils.BeanProvider;
import br.usjt.what2listen.Utils.Globals;
import br.usjt.what2listen.Controller.GenreController;
import br.usjt.what2listen.Controller.UserController;
import br.usjt.what2listen.Model.Genre;

public class UserGenre {

    @Autowired
    private UserController uc;
    @Autowired
    private GenreController gc;

    public UserGenre() {
        BeanProvider.autowire(this);
    }

    public JPanel view() {

        List<Genre> favGenres = uc.favGenres(Globals.usuarioLogado.getId());
        List<Genre> otherGenres = gc.getGenre();
        
        otherGenres.removeIf(g -> favGenres.contains(g));

        JPanel wrap = new JPanel();
        wrap.setBackground(Color.LIGHT_GRAY);
        wrap.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill=GridBagConstraints.BOTH;
        gbc.insets = new Insets(15,15,15,15);
        

        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;


        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=2;
        wrap.add(Components.title("Gêneros Favoritos", Font.BOLD, 18), gbc);
        gbc.gridwidth=1;
        
        gbc.gridx=0;
        gbc.gridy=2;
        wrap.add(Components.title("Gêneros Favoritos", Font.PLAIN, 16), gbc);

        gbc.gridx=1;
        gbc.gridy=2;
        wrap.add(Components.title("Outros Gêneros", Font.PLAIN, 16), gbc);

        gbc.gridx=0;
        gbc.gridy=3;
        gbc.weighty=6;

        JPanel leftInner = new JPanel();
        leftInner.setBorder(new EmptyBorder(20, 20, 20, 20));
        favGenres.forEach(item -> {
            JPanel p = new JPanel();
            p.setLayout(new GridBagLayout());
            GridBagConstraints gbc1 = new GridBagConstraints();
            gbc1.fill = GridBagConstraints.BOTH;
            gbc1.insets = new Insets(3, 3, 3, 3);
            gbc1.weightx=6;
            gbc1.weighty=1;
            p.add(new JLabel(item.getName()), gbc1);
            gbc1.weightx=1;
            JButton btn = new JButton("-");
            p.add(btn);
            leftInner.add(p);
        });

        leftInner.setLayout(new GridLayout(favGenres.size(), 1));
        wrap.add(new JScrollPane(leftInner), gbc);

        gbc.gridx=1;
        gbc.gridy=3;
        gbc.weighty=6;

        JPanel rightInner = new JPanel();
        rightInner.setBorder(new EmptyBorder(20, 20, 20, 20));

        otherGenres.forEach(item -> {
            
            JPanel p = new JPanel();
            p.setLayout(new GridBagLayout());
            GridBagConstraints gbc1 = new GridBagConstraints();
            gbc1.fill = GridBagConstraints.BOTH;
            gbc1.insets = new Insets(3, 3, 3, 3);
            gbc1.weightx=6;
            gbc1.weighty=1;
            p.add(new JLabel(item.getName()), gbc1);
            gbc1.weightx=1;
            JButton btn = new JButton("-");
            p.add(btn);
            rightInner.add(p);
        });

        rightInner.setLayout(new GridLayout(otherGenres.size(), 1));
        wrap.add(new JScrollPane(rightInner), gbc);

        /**
         * JPanel jp = new JPanel(); JPanel left = new JPanel(); left.setBorder(new
         * EmptyBorder(60, 60, 60, 60)); left.setBackground(Color.lightGray);
         * 
         * 
         * 
         * left.setLayout(new GridLayout(2, 1)); JScrollPane leftScroll = new
         * JScrollPane(leftInner);
         * 
         * left.add(new JLabel("teste")); left.add(leftScroll);
         * 
         * JPanel right = new JPanel(); right.setBorder(new EmptyBorder(60, 60, 60,
         * 60)); JLabel tituloLogin = new JLabel("Login"); tituloLogin.setFont(new
         * Font("Arial", Font.BOLD, 16)); right.setLayout(new GridLayout(9, 1));
         * 
         * JPanel rightInner = new JPanel(); leftInner.setBorder(new EmptyBorder(20, 20,
         * 20, 20));
         * 
         * jp.add(left); jp.add(right); jp.setLayout(new GridLayout(1, 2));
         */

        return wrap;
    }

    public void btnPlusPressed(int idGenre){
        uc.addFavGenre(idGenre);
    }

}
