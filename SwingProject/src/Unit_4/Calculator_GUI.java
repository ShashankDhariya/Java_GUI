package Unit_4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator_GUI {

	public static void main(String[] args) {
		
		calculator obj = new calculator();
	}
}

class calculator extends JFrame{
	
	JTextField t1;
	JTextField t2;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JLabel l;
	
	calculator(){
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		
		b1 = new JButton("Sum");
		b2 = new JButton("Subtract");
		b3 = new JButton("Multiply");
		b4 = new JButton("Divide");
		b5 = new JButton("Mod");
		
		l = new JLabel("Result");
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					int a = Integer.parseInt(t1.getText());
					int b = Integer.parseInt(t2.getText());
					
					Integer sum = a+b;
					l.setText(sum.toString());
				}
				
				if(e.getSource() == b2) {
					int a = Integer.parseInt(t1.getText());
					int b = Integer.parseInt(t2.getText());
					
					Integer sub = a-b;
					l.setText(sub.toString());
				}
				
				if(e.getSource() == b3) {
					int a = Integer.parseInt(t1.getText());
					int b = Integer.parseInt(t2.getText());
					
					Integer mul = a*b;
					l.setText(mul.toString());
				}
				
				if(e.getSource() == b4) {
					int a = Integer.parseInt(t1.getText());
					int b = Integer.parseInt(t2.getText());
					
					Integer div = a/b;
					l.setText(div.toString());
				}
				
				if(e.getSource() == b5) {
					int a = Integer.parseInt(t1.getText());
					int b = Integer.parseInt(t2.getText());
					
					Integer mod = a%b;
					l.setText(mod.toString());
				}
			}
		};
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(l);
		
		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		b4.addActionListener(al);
		b5.addActionListener(al);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
