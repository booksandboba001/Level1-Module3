package _06_frogger;

import java.awt.Graphics;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    static int distance;
    static int x =300;
    static int y= 389;
    Car car1 = new Car(100,50, 500,50);
    Car car2 = new Car(60,150, 500,50);
    Car car3 = new Car(60,250, 500,50);
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
    	car1.display(g);
    	car1.moveLeft(15);
    	car2.display(g);
    	car2.moveRight(10);
    	if (intersects(car2)) {
    		y=389;
    	}
    	car3.display(g);
    	car3.moveRight(10);
    	if (intersects(car3)) {
    		y=389;
    	}
    	
    }
    boolean intersects(Car car) { 
		if ((y > car.getY() && y < car.getY()+50) &&(x > car.getX() && x < car.getX()+car.getSize())) {
			return true;
			
		}else{return false;
			}
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
