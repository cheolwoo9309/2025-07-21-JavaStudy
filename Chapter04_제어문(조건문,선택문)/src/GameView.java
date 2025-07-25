import javax.swing.*; // 경량화
import java.awt.*; // Image 출력

public class GameView extends JPanel{
	Image back,pome;
	//초기화
	int x=150;
	int y=100;
	public GameView()
	{
		// 생성자 => 변수에 대한 초기화
		back=Toolkit.getDefaultToolkit().
				getImage("C:\\javaDev\\background.jpg");
		pome=Toolkit.getDefaultToolkit().
				getImage("C:\\javaDev\\pome.png");
	}
	public void paint(Graphics g)
	{
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(pome,x,y,400,350,this);
	}
}
