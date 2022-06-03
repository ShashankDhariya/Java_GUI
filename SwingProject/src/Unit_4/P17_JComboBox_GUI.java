package Unit_4;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class P17_JComboBox_GUI {
	public static void main(String[] args) {
		comboBox obj = new comboBox();
	}
}

class comboBox extends JFrame{
	
	JComboBox jc;
	
	comboBox(){
		
	String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturaday", "Sunday"};
	
	jc = new JComboBox<>(week); 
	
	add(jc);
	
	setVisible(true);
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}