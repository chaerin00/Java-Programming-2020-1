import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;

class Panel2 extends JPanel
{
	public Panel2(){
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setFont(new Font("????ü",Font.BOLD,10));

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.drawLine(50,50,50,400);
		for(int i=50;i<=400;i=i+35){
			g2.drawLine(50,i,60,i);
		}
		g2.drawLine(50,400,450,400);

		

		g2.setPaint(Color.blue);
		g2.fill(new Rectangle2D.Float(85,175,30,225));
		g2.drawString("????(32%)",80,165);

		g2.setPaint(Color.green);
		g2.fill(new Rectangle2D.Float(185,70,30,330));
		g2.drawString("????(47%)",180,60);

		g2.setPaint(Color.orange);
		g2.fill(new Rectangle2D.Float(285,275,30,125));
		g2.drawString("????(18%)",280,265);

		g2.setPaint(Color.red);
		g2.fill(new Rectangle2D.Float(385,380,30,20));
		g2.drawString("?ſ? ????(3%)",380,370);
	}
}

