import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Potencia implements ActionListener{

	
JFrame jf = new JFrame();	
JPanel jp = new JPanel();
JButton jb = new JButton("Confirmar");
JTextField tf = new JTextField();



private int HEIGHT = 800;	
private int WIDTH = 800;
	
public Potencia() {

	jf();
	estruturação();
	
}	
	
public void jf() {
	
	
	jf.setResizable(false);
	jf.setVisible(true);
	jf.setSize(WIDTH, HEIGHT);
	jf.setTitle("Novo projeto");
	jf.setLocationRelativeTo(null);
	jf.add(jb);
	jf.add(tf);
	jf.add(jp);
	
}

public void estruturação() {
	
	
	jb.setBounds(185, 200, 200, 30);
	jb.setFocusPainted(false);
	tf.setBounds(400, 200, 200, 30);
	
	

}

@Override
public void actionPerformed(ActionEvent e) {

        
}



	
}
