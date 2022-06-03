package Unit_4;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class P17_RadioAndCheckButton_GUI {
	public static void main(String[] args) {
		radioAndCheckButton_GUI obj = new radioAndCheckButton_GUI();
	}
}

class radioAndCheckButton_GUI extends JFrame{
	
	JRadioButton jb1;
	JRadioButton jb2;

	JCheckBox cb1;
	JCheckBox cb2;
	
	radioAndCheckButton_GUI(){
		
		jb1 = new JRadioButton("Interested");
		jb2 = new JRadioButton("Not Interested");
		cb1 = new JCheckBox("Car");
		cb2 = new JCheckBox("Bike");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jb1);
		bg.add(jb2);
		
		add(jb1);
		add(jb2);
		add(cb1);
		add(cb2);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}