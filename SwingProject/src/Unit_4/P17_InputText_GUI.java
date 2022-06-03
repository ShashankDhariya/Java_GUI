package Unit_4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P17_InputText_GUI {
	public static void main(String[] args) {
		Input obj = new Input();
	}
}

class Input extends JFrame{
	
	JTextField t;
	JButton b;
	
	JLabel l;
	
	Input(){
		
		t = new JTextField(30);
		b = new JButton("Enter");
		l = new JLabel("Input Number");
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b) {
					Integer a = Integer.parseInt(t.getText());
					l.setText(a.toString());
				}
				
			}
		};
		add(t);
		add(b);
		add(l);
		
		
		b.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 500);
	}
}