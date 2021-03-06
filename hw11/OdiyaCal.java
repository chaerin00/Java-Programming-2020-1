import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OdiyaCal extends JFrame
{
	JPanel menu;
	JLabel price;
	String total="??:";
	JButton[] buttons;
	int[] prices;

	public OdiyaCal(){
		menu=new JPanel(new GridLayout(3,4));
		price=new JLabel(total);
		
		int[] prices={5000,4000,3000,3000,4000,5000,5500,4000,2500,3500,5000};

		buttons=new JButton[11];


		for(int i=0;i<11;i++){
			buttons[i]=new JButton(new ImageIcon("b"+i+".png"));
			buttons[i].setBorderPainted(false);
			buttons[i].setBackground(Color.white);
			buttons[i].setFocusPainted(false);
			buttons[i].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						total=total+5000;
						price.setText(total);
				}
			});
			menu.add(buttons[i]);
		}
		add("North",menu);
		add("Center",price);
		setSize(1000,1000);
		setVisible(true);

	}


}
