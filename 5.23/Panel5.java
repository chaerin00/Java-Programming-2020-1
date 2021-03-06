import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;

class Panel5 extends JPanel
{
	public Panel5(){
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
		for(int i=1;i<13;i++){
			g2.drawString((i+"??"),50+30*i,430);
		}

		g2.setPaint(Color.red);
		g2.fill(new Ellipse2D.Float(80,172,5,5));
		g2.fill(new Ellipse2D.Float(110,200,5,5));
		g2.fill(new Ellipse2D.Float(140,155,5,5));
		g2.fill(new Ellipse2D.Float(170,260,5,5));
		g2.fill(new Ellipse2D.Float(200,235,5,5));
		g2.fill(new Ellipse2D.Float(230,295,5,5));
		g2.fill(new Ellipse2D.Float(260,310,5,5));
		g2.fill(new Ellipse2D.Float(290,308,5,5));
		g2.fill(new Ellipse2D.Float(320,330,5,5));
		g2.fill(new Ellipse2D.Float(350,290,5,5));
		g2.fill(new Ellipse2D.Float(380,260,5,5));
		g2.fill(new Ellipse2D.Float(410,263,5,5));
		g2.drawLine(80,172,110,200);
		g2.drawLine(110,200,140,155);
		g2.drawLine(140,155,170,260);
		g2.drawLine(170,260,200,235);
		g2.drawLine(200,235,230,295);
		g2.drawLine(230,295,260,310);
		g2.drawLine(260,310,290,308);
		g2.drawLine(290,308,320,330);
		g2.drawLine(320,330,350,290);
		g2.drawLine(350,290,380,260);
		g2.drawLine(380,260,410,263);
		g2.drawString("2019 ???? ???? ?̼?????",350,20);

		g2.setPaint(Color.blue);
		g2.fill(new Ellipse2D.Float(80,189,5,5));
		g2.fill(new Ellipse2D.Float(110,225,5,5));
		g2.fill(new Ellipse2D.Float(140,191,5,5));
		g2.fill(new Ellipse2D.Float(170,224,5,5));
		g2.fill(new Ellipse2D.Float(200,215,5,5));
		g2.fill(new Ellipse2D.Float(230,225,5,5));
		g2.fill(new Ellipse2D.Float(260,292,5,5));
		g2.fill(new Ellipse2D.Float(290,293,5,5));
		g2.fill(new Ellipse2D.Float(320,310,5,5));
		g2.fill(new Ellipse2D.Float(350,261,5,5));
		g2.fill(new Ellipse2D.Float(380,154,5,5));
		g2.fill(new Ellipse2D.Float(410,189,5,5));
		g2.drawLine(80,189,110,225);
		g2.drawLine(110,225,140,191);
		g2.drawLine(140,191,170,224);
		g2.drawLine(170,224,200,215);
		g2.drawLine(200,215,230,225);
		g2.drawLine(230,225,260,292);
		g2.drawLine(260,292,290,293);
		g2.drawLine(290,293,320,310);
		g2.drawLine(320,310,350,261);
		g2.drawLine(350,261,380,154);
		g2.drawLine(380,154,410,189);

		g2.drawString("2010 ???? ???? ?̼?????",350,40);


	}
}
