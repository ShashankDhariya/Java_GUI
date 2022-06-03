package Unit_4;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class P17_JTable_GUI {
	public static void main(String[] args) {
		table obj = new table();
	}
}

class table extends JFrame{
	JTable jt;
	
	table(){
	
		String data[][] = {{"1)","Shashank","43244"},{"2)","Mayank","23323"},{"3)","Ajay","87566"}};
		String column[] = {"Sr. no.","Name","ID"};
		
		jt = new JTable(data,column);
		
		add(jt);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400 ,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}