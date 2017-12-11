import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJCheckBox extends JFrame implements ActionListener{
	JCheckBox[] jc;
	JLabel[] lb;
	JRadioButton[] rb;
	JLabel lb2;

	public static void main(String[] args) {
		HelloJCheckBox hello = new HelloJCheckBox("HELLO");
		hello.setVisible(true);
	}

	HelloJCheckBox(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		jc = new JCheckBox[3];
		jc[0] = new JCheckBox("A",true);
		jc[1] = new JCheckBox("B");
		jc[2] = new JCheckBox("C");

		lb = new JLabel[3];
		lb[0] = new JLabel();
		lb[1] = new JLabel();
		lb[2] = new JLabel();
		lb2 = new JLabel();

		JButton bn1 = new JButton("OK");
		bn1.addActionListener(this);

		ButtonGroup bg = new ButtonGroup();
		rb = new JRadioButton[3];
		rb[0] = new JRadioButton("男性",true);
		rb[1] = new JRadioButton("女性");
		rb[2] = new JRadioButton("その他");

		bg.add(rb[0]);
		bg.add(rb[1]);
		bg.add(rb[2]);

		panel1.add(jc[0]);
		panel1.add(rb[0]);
		panel1.add(jc[1]);
		panel1.add(rb[1]);		
		panel1.add(jc[2]);
		panel1.add(rb[2]);
		panel1.setLayout(new GridLayout(3,1));

		panel2.add(bn1);

		panel3.add(lb[0]);
		panel3.add(lb[1]);
		panel3.add(lb[2]);
		panel3.add(lb2);

		Container cp = getContentPane();
		cp.add(panel1,BorderLayout.NORTH);
		cp.add(panel2,BorderLayout.SOUTH);
		cp.add(panel3,BorderLayout.EAST);
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("CLICK!");
		for(int i = 0; i < jc.length; i++){
			if(jc[i].isSelected()){
				lb[i].setText(jc[i].getText()+"選択中");
			}else{
				lb[i].setText("");
			}
			if(rb[i].isSelected()){
				lb2.setText(rb[i].getText());
			}
		}

	}

}