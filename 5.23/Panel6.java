import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Panel6 extends JPanel{

	public Panel6(){
		JLabel title=new JLabel("미세먼지 농도 그래프");
		Font font1=new Font("맑은 고딕",Font.BOLD,18);
		title.setFont(font1);
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title);

		JLabel sub=new JLabel("<html><br><br>제가 만든 그림은 남산타워입니다.<br> input버튼을 누르면 미세먼지 농도에 따라 남산타워의 색이 변합니다.<br><br>원그래프와 막대그래프는 2018년 3월부터 2019년 3월까지<br> 1년 간 미세먼지 농도의 통계를 나타내는 것입니다.<br><br>선그래프는 2019년과 2010년 서울의 월평균 미세먼지 농도를 나타냅니다.<br><br>&lt출처&gt<br>서울특별시 대기환경정보 홈페이지<br>sbs뉴스:[마부작침] 초미세먼지로 뒤덮인 하늘, 1년 치 한 번에 봤더니</html>");
		Font font2=new Font("맑은 고딕",Font.PLAIN,15);
		sub.setFont(font2);
		sub.setHorizontalAlignment(JLabel.CENTER);
		add(sub);
	}
}
