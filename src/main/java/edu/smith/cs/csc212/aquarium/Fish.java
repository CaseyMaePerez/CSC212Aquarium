package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Fish {
	
	// Fish basics:
	int x;
	int y;
	Color color;
	boolean isLittle;
	
	// Fish movement:
//	int destX;
//	int destY;
	boolean facingLeft;
	
	// Fish destination:
	int MIN = 0;
	int MAX_X = 420;		// Prevent body clipping.
	int MAX_Y = 460;		// Prevent body clipping.
	Random rand = new Random();		// Random number generator.
	int destX = rand.nextInt(MAX_X - MIN) + MIN;
	int destY = rand.nextInt(MAX_Y - MIN) + MIN;
	
	
	
	// Create the fish.
	public Fish(Color color, int x, int y, boolean isLittle, boolean facingLeft) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.isLittle = isLittle;
		
//		this.destX = destX;
//		this.destY = destY;
		this.facingLeft = facingLeft;
	}
	
	// Enable fish movement.
	public void swim() {
		// Horizontal movement.
		if (this.x < this.destX) {
			this.facingLeft = false;		// Fix orientation.
			this.x += 1;
		}
		else if (this.x > this.destX) {
			this.facingLeft = true;			// Fix orientation.
			this.x -= 1;
		}
		else {
			destX = rand.nextInt(MAX_X - MIN) + MIN;
		}
		
		// Vertical movement.
		if (this.y < this.destY) {
			this.y += 1;
		}
		else if (this.y > this.destY) {
			this.y -= 1;
		}
		else {
			destY = rand.nextInt(MAX_Y - MIN) + MIN;
		}
	}
	
	// Draw the fish.
	public void draw(Graphics2D g) {
		this.swim();
		
		// Determine orientation and size.
		if (this.isLittle == true && this.facingLeft == true) {
			DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		}
		else if (this.isLittle == true && this.facingLeft == false) {
			DrawFish.smallFacingRight(g, this.color, this.x, this.y);
		}
		else if (this.isLittle == false && this.facingLeft == true) {
			DrawFish.facingLeft(g, this.color, this.x, this.y);
		}
		else {
			DrawFish.facingRight(g, this.color, this.x, this.y);
		}
	}
}
