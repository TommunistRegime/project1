package workMachine;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//Thomas Stoner 
//Block:A
//May 31, 2017
//Description: Stoner's Rewind is a game where you take control of a blue square that you move around and have it "teleport"
// to avoid blue circles with varying speeds that bounce around the screen

public class StonersRewind extends JoeApplet implements KeyListener, MouseListener, MouseMotionListener
{
	//These are all the variables declared
	Font abc = new Font("Papyrus", 4, 30);
	Font cba = new Font("Papyrus", 3, 16);
	boolean showStartScreen = true;
	boolean showArea1 = false;
	boolean showGameOver = false;
	Color desert = new Color(168,136,8);
	int rewinderX = 500;
	int rewinderY = 500;
	int elseWhereX = 500;
	int elseWhereY = 500;
	int elseWhere2X = 500;
	int elseWhere2Y = 500;
	int captureX = 100;
	int captureY = 100;
	int capture2X = -200;
	int capture2Y = 100;
	int capture3X = -300;
	int capture3Y = 100;
	int capture4X = -400;
	int capture4Y = 100;
	int capture5X = -500;
	int capture5Y = 100;
	int capture6Y = 100;
	int capture6X = -600;
	int capture7X = -700;
	int capture7Y = 100;
	int capture8X = -800;
	int capture8Y = 100;
	int capture9X = -900;
	int capture9Y = 100;
	int capture10X = -1000;
	int capture10Y = 100;
	int capture11X = -1100;
	int capture11Y = 100;
	int time = 0;
	int timer = 0;
	int timer2 = 0;
	int timer3 = 1;
	// All speed Variables vary the speeds and directions of the capture units
	int speedX = -4;
	int speedY = 4;
	int speed2X = 4;
	int speed2Y = 6;
	int speed3X = 2;
	int speed3Y = 1;
	int speed4X = -3;
	int speed4Y = 3;
	int speed5X = 1;
	int speed5Y = 7;
	int speed6X = -4;
	int speed6Y = 4;
	int speed7X = 1;
	int speed7Y = 1;
	int speed8X = -2;
	int speed8Y = 5;
	int speed9X = 7;
	int speed9Y = 6;
	int speed10X = 13;
	int speed10Y = 15;
	int speed11X = -16;
	int speed11Y = 16;
	
	//These are all the solid objects
	SolidObject mouseSO = new SolidObject();
	SolidObject rewinderSO = new SolidObject();
	SolidObject captureSO = new SolidObject();
	SolidObject capture2SO = new SolidObject();
	SolidObject capture3SO = new SolidObject();
	SolidObject capture4SO = new SolidObject();
	SolidObject capture5SO = new SolidObject();
	SolidObject capture6SO = new SolidObject();
	SolidObject capture7SO = new SolidObject();
	SolidObject capture8SO = new SolidObject();
	SolidObject capture9SO = new SolidObject();
	SolidObject capture10SO = new SolidObject();
	SolidObject capture11SO = new SolidObject();
	SolidObject replaySO = new SolidObject();
	//This implements the keylistener, and mouse listeners
	public void init()
	{
		addKeyListener(this);
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	//This will create the start screen
	public void startScreen(Graphics art)
	{
		art.setFont(abc);
		setBackground(Color.black);
		art.setColor(Color.green);
		art.drawString("Stoner's REWIND", 550, 200);
		art.setColor(Color.white);
		art.setFont(cba);
		art.drawString("You take the role of a scientist (BLUE SQUARE) that has just discovered the secrets" +
				" of temporal traveling .", 200, 400);
		art.drawString("After this discovery however, you have encountered beings that seem "
				+ "to be hunting you (BLUE CIRCLES).", 200, 425);
		art.drawString("To move, use the corresponding arrow keys to avoid these beings. To set down teleport " +
				" marker 1, press Z. To set down teleport marker 2, press X.", 200, 450);
		art.drawString("Press A to teleport to marker 1 and press S to teleport to marker 2", 200,475);
		art.drawString("Press H to continue to the next screen.", 500, 500);
				
	}
	
	//This will create capture unit #1
	public void capture(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(captureX, captureY, 20, 20);
		captureSO.makeSolidObject(captureX, captureY, 20, 20);
	}
	
	//This will create capture unit #2
	public void capture2(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(capture2X, capture2Y, 20, 20);
		capture2SO.makeSolidObject(capture2X, capture2Y, 20, 20);
	}
	
	//This will create capture unit #3
	public void capture3(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(capture3X, capture3Y, 20, 20);
		capture3SO.makeSolidObject(capture3X, capture3Y, 20, 20);
	}
	
	//This will create capture unit #4
	public void capture4(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(capture4X, capture4Y, 20, 20);
		capture4SO.makeSolidObject(capture4X, capture4Y, 20, 20);
	}
	
	//This will create capture unit #5
	public void capture5(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(capture5X, capture5Y, 20, 20);
		capture5SO.makeSolidObject(capture5X, capture5Y, 20, 20);
	}
	 
	//This will create capture unit #6
	public void capture6(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(capture6X, capture6Y, 20, 20);
		capture6SO.makeSolidObject(capture6X, capture6Y, 20, 20);
	}
	
	// This will create capture unit #7
	public void capture7(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(capture7X, capture7Y, 20, 20);
		capture7SO.makeSolidObject(capture7X, capture7Y, 20, 20);
	}
	//THis will create capture unit #8
	public void capture8(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(capture8X, capture8Y, 20, 20);
		capture8SO.makeSolidObject(capture8X, capture8Y, 20, 20);
	}
	
	// This will create capture unit #9
	public void capture9(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(capture9X, capture9Y, 20, 20);
		capture9SO.makeSolidObject(capture9X, capture9Y, 20, 20);
	}
	
	// This will create capture unit #10
	public void capture10(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(capture10X, capture10Y, 20, 20);
		capture10SO.makeSolidObject(capture10X, capture10Y, 20, 20);
	}
	
	// This will create capture unit #11
	public void capture11(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillOval(capture11X, capture11Y, 20, 20);
		capture11SO.makeSolidObject(capture11X, capture11Y, 20, 20);
	}
	
	//This will make the game area
	public void area1(Graphics art)
	{
		setBackground(desert);
	}
	
	//THis will make the game overscreen
	public void gameOverScreen(Graphics art)
	{
		art.setFont(abc);
		setBackground(Color.BLACK);
		art.setColor(Color.WHITE);
		art.drawString("GAME OVER", 600, 200);
		art.setFont(cba);
		art.drawString("Click to Play Again", 675, 500);
		
	}
	
	//This will create the button that will be used to restart the game 
	public void replay(Graphics art)
	{
		art.setColor(Color.white);
		art.drawRect(650, 475, 200, 40);
		replaySO.makeSolidObject(650, 475, 200, 40);
	}

	// This is the "character" the player will play as
	public void rewinder(Graphics art)
	{
		art.setColor(Color.blue);
		art.fillRect(rewinderX, rewinderY, 100, 100);
		rewinderSO.makeSolidObject(rewinderX, rewinderY,100,100);
	}
	
	//This will put the outline for where the character will
	// teleport if "" is pressed
	public void rewinder2(Graphics art)
	{
		art.setColor(Color.gray);
		art.drawRect(elseWhereX, elseWhereY, 100, 100);
	}
	
	//This will put the outline for where the character will
	// teleport if "" is pressed
	public void rewinder3(Graphics art)
	{
		art.setColor(Color.black);
		art.drawRect(elseWhere2X, elseWhere2Y, 100, 100);
	}
	
	//This implements a timer that is displayed that counts score
	// And determines if "capture units" spawn in.
	public void timer1(Graphics art)
	{
		time++;
		timer = time/40;
		if(showGameOver)
		{
			time--;
		}
		art.drawString("Score=" +timer, 675, 50);
		//SPawns capture 2
		if(timer ==10)
		{
			capture2X = 200;
		}
		//Spawns Capture 3
		if(timer == 20)
		{
			capture3X = 300;
		}
		//SPawns capture 4
		if(timer == 30)
		{
			capture4X = 400;
		}
		//Spawns capture 5
		if(timer == 40)
		{
			capture5X = 500;
		}
		if(timer == 50)
		{
			capture6X = 600;
		}
		if(timer == 60)
		{
			capture7X = 700;
		}
		if(timer == 70)
		{
			capture8X = 800;
		}
		if(timer == 80)
		{
			capture9X = 900;
		}
		if(timer == 90)
		{
			capture10X = 1000;
		}
		if(timer == 100)
		{
			capture11X = 1100;
		}
	}

	//this will allow for the "capture units" to bounce, change direction,
	// and move when they spawn in
	public void movement()
	{
		if(timer >= 0)
		{
			captureX = captureX + speedX;
			captureY = captureY + speedY;
			if(captureX >= 1330 || captureX <= 0)
			{
				speedX = -speedX;
			}
			if(captureY >= 630 || captureY <= 0)
			{
			speedY = -speedY;
			}
		}
		if(timer >= 10)
		{
			capture2X = capture2X + speed2X;
			capture2Y = capture2Y + speed2Y;
			if(capture2X >= 1330 || capture2X <= 0)
			{
				speed2X = -speed2X;
			}
			if(capture2Y >= 630 || capture2Y <= 0)
			{
				speed2Y = -speed2Y;
			}
		}
		if(timer >= 20)
		{
			capture3X = capture3X + speed3X;
			capture3Y = capture3Y + speed3Y;
			if(capture3X >= 1330 || capture3X <= 0)
			{
				speed3X = -speed3X;
				
			}
			if(capture3Y >= 630 || capture3Y <= 0)
			{
				speed3Y = -speed3Y;
			}
		}
		if(timer >= 30)
		{
			capture4X = capture4X + speed4X;
			capture4Y = capture4Y + speed4Y;
			if(capture4X >= 1330 || capture4X <= 0)
			{
				speed4X = -speed4X;
				
			}
			if(capture4Y >= 630 || capture4Y <= 0)
			{
				speed4Y = -speed4Y;
			}
			
		}
		if(timer >= 40)
		{
			capture5X = capture5X + speed5X;
			capture5Y = capture5Y + speed5Y;
			if(capture5X >= 1330 || capture5X <= 0)
			{
				speed5X = -speed5X;
				
			}
			if(capture5Y >= 630 || capture5Y <= 0)
			{
				speed5Y = -speed5Y;
			}
			
		}
		if(timer >= 50)
		{
			capture6X = capture6X + speed6X;
			capture6Y = capture6Y + speed6Y;
			if(capture6X >= 1330 || capture6X <= 0)
			{
				speed6X = -speed6X;
				
			}
			if(capture6Y >= 630 || capture6Y <= 0)
			{
				speed6Y = -speed6Y;
			}
			
		}
		if(timer >= 60)
		{
			capture7X = capture7X + speed7X;
			capture7Y = capture7Y + speed7Y;
			if(capture7X >= 1330 || capture7X <= 0)
			{
				speed7X = -speed7X;
				
			}
			if(capture7Y >= 630 || capture7Y <= 0)
			{
				speed7Y = -speed7Y;
			}
			
		}
		if(timer >= 70)
		{
			capture8X = capture8X + speed8X;
			capture8Y = capture8Y + speed8Y;
			if(capture8X >= 1330 || capture8X <= 0)
			{
				speed8X = -speed8X;
				
			}
			if(capture8Y >= 630 || capture8Y <= 0)
			{
				speed8Y = -speed8Y;
			}
			
		}
		if(timer >= 80)
		{
			capture9X = capture9X + speed9X;
			capture9Y = capture9Y + speed9Y;
			if(capture9X >= 1330 || capture9X <= 0)
			{
				speed9X = -speed9X;
				
			}
			if(capture9Y >= 630 || capture9Y <= 0)
			{
				speed9Y = -speed9Y;
			}
			
		}
		if(timer >= 90)
		{
			capture10X = capture10X + speed10X;
			capture10Y = capture10Y + speed10Y;
			if(capture10X >= 1330 || capture10X <= 0)
			{
				speed10X = -speed10X;
				
			}
			if(capture10Y >= 630 || capture10Y <= 0)
			{
				speed10Y = -speed10Y;
			}
		}
		if(timer >= 100)
		{
			capture11X = capture11X + speed11X;
			capture11Y = capture11Y + speed11Y;
			if(capture11X >= 1330 || capture11X <= 0)
			{
				speed11X = -speed11X;
				
			}
			if(capture11Y >= 630 || capture11Y <= 0)
			{
				speed11Y = -speed11Y;
			}
			
		}
		
		
	}
	
	//THis will prompt the game over
	public void gameOver()
	{
		//These methods will prompt game over once
		if(rewinderSO.isCollidingWith( captureSO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
		if(rewinderSO.isCollidingWith( capture2SO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
		if(rewinderSO.isCollidingWith( capture3SO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
		if(rewinderSO.isCollidingWith( capture4SO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
		if(rewinderSO.isCollidingWith( capture5SO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
		if(rewinderSO.isCollidingWith( capture6SO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
		if(rewinderSO.isCollidingWith( capture7SO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
		if(rewinderSO.isCollidingWith( capture8SO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
		if(rewinderSO.isCollidingWith( capture9SO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
		if(rewinderSO.isCollidingWith( capture10SO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
		if(rewinderSO.isCollidingWith( capture11SO))
		{
			showArea1 = false;
			showGameOver= true;
			time--;
		}
	}

	//This implements everything into the screen and game
	public void paint(Graphics art)
	{
		setSize(1350,650);
		if(showStartScreen)
		{
			startScreen(art);
	
		}
		if(showArea1)
		{
			area1(art);
			rewinder(art);
			rewinder2(art);
			rewinder3(art);
			timer1(art);
			capture (art);
			capture2(art);
			capture3(art);
			capture4(art);
			capture5(art);
			capture6(art);
			capture7(art);
			capture8(art);
			capture9(art);
			capture10(art);
			capture11(art);
			gameOver();
			movement();
		}
		if(showGameOver)
		{
			gameOverScreen(art);
			timer1(art);
			replay(art); 
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
		mouseSO.makeSolidObject(e.getX(), e.getY(), 2, 2);
		if(mouseSO.isCollidingWith(replaySO))
		{
			showGameOver = false;
			showStartScreen = true;
			rewinderX = 500;
			rewinderY = 500;
			elseWhereX = 500;
			elseWhereY = 500;
			elseWhere2X = 500;
			elseWhere2Y = 500;
			timer = 0;
			time= 0;
			captureX = 100;
			captureY = 100;
			capture2X = -200;
			capture2Y = 100;
			capture3X = -300;
			capture3Y = 100;
			capture4X = -400;
			capture4Y = 100;
			capture5X = -500;
			capture5Y = 100;
			capture6Y = 100;
			capture6X = -600;
			capture7X = -700;
			capture7Y = 100;
			capture8X = -800;
			capture8Y = 100;
			capture9X = -900;
			capture9Y = 100;
			capture10X = -1000;
			capture10Y = 100;
			capture11X = -1100;
			capture11Y = 100;
			
		}
	}

	public void mouseEntered(MouseEvent arg0)
	{
	}

	public void mouseExited(MouseEvent arg0)
	{
	}

	public void mousePressed(MouseEvent arg0)
	{
	}

	public void mouseReleased(MouseEvent arg0)
	{
	}

	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		//This places down the "A" teleport
		if (key == e.VK_X)
		{
			elseWhereX = rewinderX;
			elseWhereY = rewinderY;
		}
		
		//This places down the 
		if (key == e.VK_Z)
		{
			elseWhere2X = rewinderX; 
			elseWhere2Y = rewinderY;
		}
		
		//This starts the game
		if (key == e.VK_H)
		{
			if(showStartScreen)
			{
				showStartScreen = false;
				showArea1 = true;
			}
	
		}
		
		//This will teleport to rewinder
		if (key == e.VK_S)
		{
			rewinderX = elseWhereX;
			rewinderY = elseWhereY;
		}
		
		//This will teleport to rewinder
		if (key == e.VK_A)
		{
			rewinderX = elseWhere2X;
			rewinderY = elseWhere2Y;
		}
		
		//This will move the character downwards
		if (key == e.VK_DOWN)
		{
			rewinderY = rewinderY + 4;
			if(rewinderY >= 550)
			{
				rewinderY = rewinderY-4;
			}
		}
		
		//This will move the character upwards
		if (key == e.VK_UP)
		{
			rewinderY = rewinderY - 4;
			if(rewinderY <= 0)
			{
				rewinderY = rewinderY+4;
			}
		}
		
		//This will move the character to the right
		if (key == e.VK_RIGHT)
		{
			rewinderX = rewinderX + 4;
			if(rewinderX >= 1250)
			{
				rewinderX = rewinderX-4;
			}
		}
		
		//This will move the character to the right
		if (key == e.VK_LEFT)
		{
			rewinderX = rewinderX - 4;
			if(rewinderX <= 0)
			{
				rewinderX = rewinderX+4;
			}
		}
		
		
		
		
	}

	public void keyReleased(KeyEvent arg0)
	{
	}

	public void keyTyped(KeyEvent arg0)
	{
	}

}
