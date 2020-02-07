package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Fish {
	
	// Fish basics:
	int x;
	int y;
	Color color;
	boolean isLittle;
	
	// Fish path:
	int destX;
	int destY;
	boolean facingLeft;
	
	public Fish(Color color, int x, int y, boolean isLittle, boolean facingLeft) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.isLittle = isLittle;
		
		this.destX = 450;
		this.destY = 450;
	}
	
	public void swim() {
		if (this.y < this.destY) {
			this.y += 1;
		}
	}
	
	public void draw(Graphics2D g) {
		this.swim();
		
		if (this.isLittle == true) {
			DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		}
		else {
			DrawFish.facingLeft(g, this.color, this.x, this.y);
		}
	}
	
	
	// Base code modified from DrawFish.java
	// Referenced own file fishClass.py from CSC 111
//		if (facingLeft == true) {		// Left-facing fish.
//			Shape body = new Ellipse2D.Double(x - 40, y - 20, 80, 40);
//			Shape tail = new Ellipse2D.Double(x + 30, y - 30, 20, 60);
//			Shape eye = new Ellipse2D.Double(x - 15, y - 10, 10, 10);
//
//			// Draw the tail.
//			Color tailColor = color.darker();
//			g.setColor(tailColor);
//			g.fill(tail);
//
//			// Draw the tail outline.
//			g.setColor(Color.black);
//			g.draw(tail);
//
//			// Draw the body.
//			g.setColor(color);
//			g.fill(body);
//
//			// Draw the body outline.
//			g.setColor(Color.black);
//			g.draw(body);
//
//			// Draw the eye.
//			g.setColor(Color.white);
//			g.fill(eye);
//		}
//		else {		// Right-facing fish
//			Shape body = new Ellipse2D.Double(x - 40, y - 20, 80, 40);
//			Shape tail = new Ellipse2D.Double(x - 50, y - 30, 20, 60);
//			Shape eye = new Ellipse2D.Double(x + 5, y - 10, 10, 10);
//
//			// Draw the tail.
//			Color tailColor = color.darker();
//			g.setColor(tailColor);
//			g.fill(tail);
//
//			// Draw the tail outline.
//			g.setColor(Color.black);
//			g.draw(tail);
//
//			// Draw the body.
//			g.setColor(color);
//			g.fill(body);
//
//			// Draw the body outline.
//			g.setColor(Color.black);
//			g.draw(body);
//
//			// Draw the eye.
//			g.setColor(Color.white);
//			g.fill(eye);
//		}
//	}
}
