import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class TextEvent1 implements TextListener,ActionListener 
{
	JFrame f;
	public TextEvent1(){
		f=new JFrame();
		TextArea edit=new TextArea();
		edit.addTextListener(this);
		JButton exit=new JButton("Exit");
		exit.addActionListener(this);
		f.add("Center",edit);
		f.add("South",exit);
		f.setSize(300,250);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		f.setVisible(false);
		f.dispose();
		System.exit(0);
	}
	public void textValueChanged(TextEvent e){
		System.out.println("���� �����");
	}
}
