package workMachine;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//Thomas Stoner 
//Block:A
//May 19, 2017
//Description
//

public class StonersCastleRaid extends JoeApplet implements KeyListener, MouseListener, MouseMotionListener
{
	Font abc = new Font("Papyrus", 4, 30);
	Font cba = new Font("Papyrus", 3, 16);
	boolean showStartScreen = true;
	boolean showStartScreen2 = false;
	boolean showArea1 = false;
	int warriorX= 200;
	int characterY = 200;
	int mageX = 600;
	int thiefX= 1000;
	int originMX = -300;
	int originMY = -300;
	int originTX = -300;
	int originTY = -300;
	int originWX = -300;
	int originWY = -300;
	int thiefY = 200;
	int warriorY = 200;
	int mageY = 200;
	int speed = 5;
	boolean showMageTest2 = false;
	boolean showWarriorTest2 = false;
	boolean showThiefTest2 = false;
	Color desert = new Color(168,136,8);
	
	//This implements the keylistener, and mouse listeners
	public void init()
	{
		addKeyListener(this);
		addMouseMotionListener(this);
		addMouseListener(this);
	}
		
		
	
	
	SolidObject warriorTestSO =new SolidObject();
	SolidObject warriorTest2SO =new SolidObject();
	SolidObject mouseSO = new SolidObject();
	SolidObject mageTestSO = new SolidObject();
	SolidObject mageTest2SO = new SolidObject();
	SolidObject thiefTestSO = new SolidObject();
	SolidObject thiefTest2SO = new SolidObject();
	public void startScreen(Graphics art)
	{
		art.setFont(abc);
		setBackground(Color.black);
		art.setColor(Color.red);
		art.drawString("Stoner's Castle Raid", 550, 200);
		art.setColor(Color.white);
		art.setFont(cba);
		art.drawString("You are a wandering hero who was tasked with the scouring of Castle" +
				" Nonmalum, which has succumbed to the Abyss.", 200, 400);
		art.drawString("To move, use the corresponding arrow keys. To interact with objects" +
				" or attack enemies press X. Use I to open inventory.", 200, 425);
		art.drawString("Use the mouse to select an object from the inventory. Fight enemies" +
				"to level up your character.", 200,450);
		art.drawString("Press H to continue to the next screen.", 500, 500);
				
	}

	public void mageTest(Graphics art)
	{
		art.setColor(Color.red);
		art.fillRect(mageX, mageY, 200, 200);
		mageTestSO.makeSolidObject(mageX, mageY,200,200);
	}
	
	public void mageTest2(Graphics art)
	{
		art.setColor(Color.red);
		art.fillRect(originMX, originMY, 100, 100);
		mageTest2SO.makeSolidObject(originMX, originMY,100,100);
	}
	
	
	public void startScreen2(Graphics art)
	{
		art.setFont(cba);
		setBackground(Color.black);
		
	}
	
	public void area1(Graphics art)
	{
		setBackground(desert);
	}
	
	public void paint(Graphics art)
	{
		setSize(2000,3000);
		if(showStartScreen)
		{
			startScreen(art);
	
		}
		if(showArea1)
		{
			area1(art);
			mageTest2(art);
		}
		repaint();
	}
		
	public void mouseDragged(MouseEvent e)		
	{
	}

	public void mouseMoved(MouseEvent e)
	{
	}

	public void mouseClicked(MouseEvent e)
	{
	}
	

	public void mouseEntered(MouseEvent arg0)
	{
	}

	public void mouseExited(MouseEvent arg0)
	{
	}

	public void mousePressed(MouseEvent e)
	{
		
	}

	public void mouseReleased(MouseEvent arg0)
	{
	}

	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		
		if (key == e.VK_H)
			{
				if(showStartScreen =true)
				{
					showStartScreen = false;
					showArea1 = true;
					originMY = 500;
					originMX =500;
				}
		
			}
		
		if( key == e.VK_LEFT);
		{
			
			originMX = originMX-speed;
			
		}
			
		
		if( key == e.VK_DOWN);
		{
			
			originMY = originMY+speed;
			
		}
		
		
		
	
	}

	public void keyReleased(KeyEvent arg0)
	{
	}

	public void keyTyped(KeyEvent arg0)
	{
	}

}
