package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    static int distance;
    static int x =300;
    static int y= 389;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	setSize(800,600);
    }

    @Override
    public void draw() {
    	background(255,255,255);
    	fill(0,255,0);
    	ellipse(x,y,20,20);
    	 
    }
    public void keyPressed() {
    	if(key == CODED){
    		if(keyCode == UP){
    			y-=10;
    		}else if(keyCode == DOWN){
    			y+=10;
			}else if(keyCode == RIGHT){
				 x+=10;
			}else if(keyCode == LEFT){
				x-=10;
			}
    	}
    	if(x>590) {
    		x=590;
    	}
    	if(x<10) {
    		x=10;
    	}
    	if(y>389) {
    		y=389;
    	}
    	if(y<19) {
    		y=10;
    	}
	 }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
