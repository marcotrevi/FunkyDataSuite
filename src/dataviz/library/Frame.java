package dataviz.library;

import processing.core.PApplet;

public class Frame {
	
	PApplet myParent;
	int x = 0;
	int y = 0;
	
	public Frame(PApplet theParent, int x, int y) {
		myParent = theParent;
		this.x = x;
		this.y = y;
	}
}

