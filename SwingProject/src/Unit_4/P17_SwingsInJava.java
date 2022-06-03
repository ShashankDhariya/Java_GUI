package Unit_4;
 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P17_SwingsInJava {
	public static void main(String[] args) {
		SampleSwingCode obj = new SampleSwingCode();
	}
}

class SampleSwingCode extends JFrame{
	
	JTextArea tf1;
	
	JTextField t1;				// Text field Format
	JTextField t2;
	
	JButton b1;					// Button field Format
	JButton b2;
	
	JLabel l1;
	JRadioButton r1;			// RadioButton field Format
	JRadioButton r2;
	
	JCheckBox c1;
	JCheckBox c2;
	
	JList list;
	JComboBox jb1;				// Alternative of list(Arranges list in proper order - Won't show whole list until Box is clicked)
	
	SampleSwingCode(){
		
		tf1 = new JTextArea();
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		
		b1 = new JButton("SUM");
		b2 = new JButton("SUB");
		
		l1 = new JLabel("Result");
		
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		 
		c1 = new JCheckBox("Singer");
		c2 = new JCheckBox("Dancer");
		
//		String week to store days of week
		String week[] = {"Monday", "Tuesday", "Wednesday" ,"Thursday", "Friday", "Saturday", "Sunday"};
		
		list = new JList(week);
		jb1 = new JComboBox<>(week);
 		
		add(t1);
		add(t2);	
		
//		Radio Buttons(Tick)
		add(r1);
		add(r2);
		
//		CheckBox
		add(c1);
		add(c2);
		
		add(b1);
		add(b2);
		add(l1);
		add(tf1);
		
//		add(list);
//		add(jb1);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a1 = Integer.parseInt(t1.getText());
				int a2 = Integer.parseInt(t2.getText());
				
				if(e.getSource() == b1)
				{
					Integer sum = a1 + a2;
					l1.setText(sum.toString());
				}
				
				if(e.getSource() == b2){
					Integer sub = a1 - a2;
					l1.setText(sub.toString());
				}
				
				if(r1.isSelected()) {
					l1.setText("Male Selected");
				}
				
				if(r2.isSelected()) { 
					l1.setText("Female Selected");
				}
				
				if(c1.isSelected()) {
					l1.setText("Singer_Selected");
				}
				
				if(c2.isSelected()) { 
					l1.setText("Dancer_Selected");
				}
				
				if(list.getSelectedIndex() != -1) {
					l1.setText("Day : "+list.getSelectedValue());
				}
				
				if(jb1.getSelectedIndex() != -1) {
					l1.setText("Day : "+jb1.getSelectedItem());
				}
			}
			
		};
		
//		Adding logic to button b1
		b1.addActionListener(al);
		b2.addActionListener(al);
		r1.addActionListener(al);
		r2.addActionListener(al);
		c1.addActionListener(al);
		c2.addActionListener(al);
		
		setLayout(new FlowLayout());			// Avoids overzRidding
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}