import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Panel6 extends JPanel{

	public Panel6(){
		JLabel title=new JLabel("�̼����� �� �׷���");
		Font font1=new Font("���� ����",Font.BOLD,18);
		title.setFont(font1);
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title);

		JLabel sub=new JLabel("<html><br><br>���� ���� �׸��� ����Ÿ���Դϴ�.<br> input��ư�� ������ �̼����� �󵵿� ���� ����Ÿ���� ���� ���մϴ�.<br><br>���׷����� ����׷����� 2018�� 3������ 2019�� 3������<br> 1�� �� �̼����� ���� ��踦 ��Ÿ���� ���Դϴ�.<br><br>���׷����� 2019��� 2010�� ������ ����� �̼����� �󵵸� ��Ÿ���ϴ�.<br><br>&lt��ó&gt<br>����Ư���� ���ȯ������ Ȩ������<br>sbs����:[������ħ] �ʹ̼������� �ڵ��� �ϴ�, 1�� ġ �� ���� �ô���</html>");
		Font font2=new Font("���� ����",Font.PLAIN,15);
		sub.setFont(font2);
		sub.setHorizontalAlignment(JLabel.CENTER);
		add(sub);
	}
}