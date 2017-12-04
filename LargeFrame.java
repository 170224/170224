import javax.swing.JFrame;

public class LargeFrame extends JFrame{
	LargeFrame(String title){
		setTitle(title);
		setLocationg(0,0);
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		LargeFrame frame = new LargeFrame("ALOHA");
		frame.setVisible(true);
	}
}

