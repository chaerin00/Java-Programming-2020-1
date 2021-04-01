import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ItemEventCheck extends Frame implements ItemListener,ActionListener
{
	Frame f;
	Checkbox one,two;
	Checkbox male,female;
	CheckboxGroup cbg;
	Button exit;
	
	public ItemEventCheck(){
		f=new Frame();
		Panel top=new Panel();
		top.add(one=new Checkbox("One"));
		one.addItemListener(this);
		top.add(two=new Checkbox("Two"));
		two.addItemListener(this);

		Panel bottom=new Panel();
		cbg=new CheckboxGroup();
		bottom.add(male=new Checkbox("����",cbg,true));
		male.addItemListener(this);
		bottom.add(female=new Checkbox("����",cbg,true));
		female.addItemListener(this);

		exit=new Button("Exit");
		exit.addActionListener(this);

		f.add("North",top);
		f.add("South",bottom);
		f.add("East",exit);

		f.setSize(300,200);
		f.setVisible(true);

	}
	public void itemStateChanged(ItemEvent e){
		Object o=e.getSource();

		if(o==one){
			System.out.println(e.getItem());
		}else if(o==two){
			if(e.getStateChange()==ItemEvent.SELECTED){
				System.out.println("2�� ���õ�");
			}else{
				System.out.println("2�� ���þȵ�");
			}
		}else if(o==male){
			System.out.println("���ڰ� ���õ�");
		}else if(o==female){
			System.out.println("���ڰ� ���õ�");
		}


	}
	public void actionPerformed(ActionEvent e){
		
	}
}
