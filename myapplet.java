import java.applet.*;
import java.awt.*;
/*
<applet code="myapplet" width=400 height=400>
</applet>
*/

public class myapplet extends Applet
{
	public void init()
	{
		System.out.println("Init called..");
	}

	public void start()
	{
		System.out.println("start called..");
	}
	public void stop()
	{
		System.out.println("stop called..");
	}
	public void destroy()
	{
		System.out.println("Destroy called..");
	}

/*public void paint(Graphics g)
	{
		this.setBackground(Color.pink);

		Font f=new Font("Times New Roman",Font.BOLD,20);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("Welcome To Applet",160,30);

		g.setColor(Color.yellow);
		g.drawOval(185,50,100,100);
		g.drawOval(200,70,20,20);
		g.drawOval(250,70,20,20);

		g.drawLine(235,90,235,110);
		g.drawArc(220,120,30,10,170,205);

		g.setColor(Color.black);
		g.drawRect(300,150,90,50);

		g.setColor(Color.blue);
		g.drawLine(100,210,100,300);
		g.drawLine(55,255,145,255);
		g.drawLine(100,210,145,210);
		g.drawLine(55,210,55,255);
		g.drawLine(145,255,145,300);
		g.drawLine(55,300,100,300);

		g.drawOval(120,230,10,10);
		g.drawOval(75,230,10,10);

		 g.drawOval(120,275,10,10);
		g.drawOval(75,275,10,10);


	}*/


}
