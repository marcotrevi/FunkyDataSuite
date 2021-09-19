package dataviz.library;

import processing.core.*;

/**
 * This is a template class and can be used to start a new processing Library.
 * Make sure you rename this class as well as the name of the example package 'template' 
 * to your own Library naming convention.
 * 
 * (the tag example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 * @example Hello 
 */

public class DataVizSuite {
	
	// myParent is a reference to the parent sketch
	PApplet myParent;
	
	public final static String VERSION = "##library.prettyVersion##";
	
	public DataVizSuite(PApplet theParent) {
		myParent = theParent;
		welcome();
	}
	
	/* version info etc */
	private void welcome() {
		System.out.println("##library.name## ##library.prettyVersion## by ##author##");
	}
			
	/* actual library code */
}

