import java.awt.Graphics;
import java.util.Random;

public class Zombies extends Soldier{
	int vx;
	int vy;
	
	int ax; 
	int ay;
	
	Animation [] anim;
	
	/*static final int UP = 0;
	static final int DN = 1;
	static final int LT = 2;
	static final int RT = 3;
	
	int pose = RT;
	
	boolean moving = false;*/
	
	public Zombies(int x, int y, int w, int h) {
		super(x, y, w, h);
		
		String [] pose = {"walk"};
		
		for(int i = 0; i < anim.length; i++) {
			anim[i] = new Animation("fz-" + pose[i] + "-", 10, ".GIF", 15);
		}
	}
	
	public void draw(Graphics g) {
		g.drawImage(anim[0].currentImage(), x, y, w/2, h/2, null);
	}
