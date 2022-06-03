package Unit_4;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class P17_JScrollBar_GUI {
	public static void main(String[] args) {
		scrollBar obj = new scrollBar();
	}
}

class scrollBar extends JFrame{
	
	JScrollBar sb;
	
	scrollBar(){
		
		sb = new JScrollBar();
		
		add(sb);
		
		setLayout(new FlowLayout());	
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
