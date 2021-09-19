package dataviz.library;

import processing.core.PApplet;
import java.lang.Math;

public class mathUtility {
	
	PApplet myParent;
	
	public mathUtility(PApplet theParent) {
		myParent = theParent;
	}
	
	double norma(float x, float y) {
		return Math.sqrt(x*x+y*y);
	}
}

