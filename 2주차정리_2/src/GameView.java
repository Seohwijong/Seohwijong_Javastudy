import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameView extends JPanel {
	Image back,air;
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\back.jpg");
		air=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\air.png");
	}
	public void paint(Graphics g)
	{
		g.drawImage(back, 0, 0,getWidth(),getHeight(),this );
		g.drawImage(air, 600, 100,150,120,this );
	}
}
