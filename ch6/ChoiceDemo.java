import java.awt.*;
public class ChoiceDemo extends Frame
{
	public ChoiceDemo(String msg){
		super(msg);

		setLayout(new FlowLayout());
		Choice c=new Choice();
		c.add("One");
		c.add("Two");
		c.add("Three");
		c.add("Four");
		c.add("Five");
		c.add("Six");
		add(c);
		setSize(300,200);
		setVisible(true);
	}
}  
