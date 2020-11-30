package br.usjt.what2listen.View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.what2listen.Controller.UserController;
import br.usjt.what2listen.Model.UserTable;
import br.usjt.what2listen.Utils.BeanProvider;
import br.usjt.what2listen.Utils.Globals;

public class Login {

	@Autowired
	private UserController uc;

	public Login() {
		BeanProvider.autowire(this);
	}

	public JPanel loginView() {
		JPanel jp = new JPanel();
		JPanel left = new JPanel();
		left.setBorder(new EmptyBorder(60, 60, 60, 60));
		left.setBackground(Color.lightGray);
		JLabel tituloCadastro = new JLabel("Cadastro");
		tituloCadastro.setFont(new Font("Arial", Font.BOLD, 16));
		JLabel labelUserCad = new JLabel("Username cad:");
		JTextField labelUserCadF = new JTextField();
		JLabel labelMailCad = new JLabel("Email cad:");
		JTextField labelMailCadF = new JTextField("gusVLZ");
		JLabel labelPasswordCad = new JLabel("Password cad:");
		JPasswordField labelPasswordCadF = new JPasswordField("123456");
		JLabel labelEmpty1 = new JLabel("");
		JButton btnCad = new JButton("Cadastrar");

		left.add(tituloCadastro);
		left.add(labelUserCad);
		left.add(labelUserCadF);
		left.add(labelMailCad);
		left.add(labelMailCadF);
		left.add(labelPasswordCad);
		left.add(labelPasswordCadF);
		left.add(labelEmpty1);
		left.add(btnCad);
		left.setLayout(new GridLayout(9, 1));

		JPanel right = new JPanel();
		right.setBorder(new EmptyBorder(60, 60, 60, 60));
		JLabel tituloLogin = new JLabel("Login");
		tituloLogin.setFont(new Font("Arial", Font.BOLD, 16));
		JLabel labelUser = new JLabel("Username:");
		JTextField txtUserL = new JTextField();
		JLabel labelPassword = new JLabel("Password :");
		JPasswordField txtPasswordL = new JPasswordField();
		JLabel labelEmpty = new JLabel("");
		JButton btnlog = new JButton("Logar");

		btnCad.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				UserTable c = new UserTable();
				c.setUsername(labelUserCadF.getText());
				c.setPassword(new String(labelPasswordCadF.getPassword()));
				c.setEmail(labelMailCadF.getText());
				try {
					UserTable cl = uc.addCliente(c);
					
					if (cl != null && cl.getId() > 0) {
						JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
						Globals.usuarioLogado = cl;
						MainFrame.jf.setContentPane(Menu.menuView());
						MainFrame.jf.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro.");
					}
				}
				catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro.");
				}
			}
		});

		btnlog.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtUserL.getText());

				UserTable u = new UserTable();
				u.setUsername(txtUserL.getText());
				u.setPassword(new String(txtPasswordL.getPassword()));
				UserTable ul = uc.login(u);

				if (ul != null && ul.getId() > 0) {
					Globals.usuarioLogado = ul;
					MainFrame.jf.setContentPane(Menu.menuView());
					MainFrame.jf.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
				}
			}
		});

		right.add(tituloLogin);
		right.add(labelUser);
		right.add(txtUserL);
		right.add(labelPassword);
		right.add(txtPasswordL);
		right.add(labelEmpty);
		right.add(btnlog);
		right.setLayout(new GridLayout(9, 1));

		jp.add(left);
		jp.add(right);
		jp.setLayout(new GridLayout(1, 2));

		return jp;
	}
}
