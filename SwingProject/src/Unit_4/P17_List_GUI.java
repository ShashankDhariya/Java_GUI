package Unit_4;

import javax.swing.JFrame;
import javax.swing.JList;

public class P17_List_GUI {
	public static void main(String[] args) {
		list obj = new list();
	}
}

class list extends JFrame{
	
	JList list;
	
	list(){
		
	String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturaday", "Sunday"};
	
	list = new JList(week); 
	
	add(list);
	
	setVisible(true);
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
