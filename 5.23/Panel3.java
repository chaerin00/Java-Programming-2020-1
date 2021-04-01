import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;

class Panel3 extends JPanel implements ActionListener
{
	int[] x1={240,230,270,260};
	int[] y1={170,220,220,170};

	int[] x2={240,260,250};
	int[] y2={170,170,70};

	JButton b1,b2,b3,b4;
	GradientPaint color=new GradientPaint(0,0,Color.WHITE,0,100,Color.WHITE);
	public Panel3(GradientPaint c){
		color=c;
		b1=new JButton("좋음");
		b1.addActionListener(this);
		
		b2=new JButton("보통");
		b2.addActionListener(this);
		b3=new JButton("나쁨");
		b3.addActionListener(this);
		b4=new JButton("매우나쁨");
		b4.addActionListener(this);

		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
	public void paintComponent(Graphics g){

		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			

		g2.setPaint(new Color(192,192,192));
		g2.fill(new Rectangle2D.Float(180,450,140,50));


		g2.setPaint(color);
		//g2.fill(new Rectangle2D.Float(230,250,40,200));
		g2.fillRect(230,250,40,200);
		

		g2.setPaint(new Color(192,192,192));
		g2.fill(new Rectangle2D.Float(220,220,60,30));

		g2.setPaint(Color.white);
		g2.fillPolygon(x1,y1,4);

		g2.setPaint(Color.red);
		g2.fillPolygon(x2,y2,3);
		g2.setPaint(Color.red);
		g2.drawLine(250,70,250,10);

	}
	public void actionPerformed(ActionEvent e){
		Object o=e.getSource();
		if(o==b1){
			color=new GradientPaint(230,250,Color.WHITE,230,400,Color.blue);
			System.out.println("누름");}

		else if(o==b2){
			color=new GradientPaint(230,250,Color.WHITE,230,400,Color.green);
			System.out.println("누름");}
		else if(o==b3){
			System.out.println("누름");
			color=new GradientPaint(230,250,Color.WHITE,230,400,Color.orange);}
		else if(o==b4){
			color=new GradientPaint(230,250,Color.WHITE,230,400,Color.red);
			System.out.println("누름");
		}
		repaint();


	}
}


