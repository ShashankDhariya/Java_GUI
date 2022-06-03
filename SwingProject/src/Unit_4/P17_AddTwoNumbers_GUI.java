package Unit_4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class P17_AddTwoNumbers_GUI {
	public static void main(String[] args) {
		addTwoNumbers obj = new addTwoNumbers();
	}
}

class addTwoNumbers extends JFrame{
	
	JTextField t1;
	JTextField t2;
	JButton b1;
	JButton b2;
	JLabel l;
	
	addTwoNumbers(){
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		
		b1 = new JButton("Sum");
		b2 = new JButton("Subtract");
		
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
			}
		};
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(l);
		
		b1.addActionListener(al);
		b2.addActionListener(al);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
