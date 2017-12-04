import java.awt.*;
import javax.swing.*;

public class TestGui extends JFrame{
	public static void main(String[] args){
		TestGui tg = new TestGui("TestGui");
		tg.setVisible(true);
	}
		TestGui(String title){
			setTitle(title);
			setLocation(100,100);
			setSize(400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField field = new JTextField("",20);
		JPasswordField pfield = new JPasswordField("ALOHA");
		

		JPanel panel = new JPanel();
		panel.add(field);
		panel.add(pfield);

		Container cp = getContentPane();
		cp.add(panel);
		}
}


