package com.bridgelabz.annotations;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("deprecation")
public class First extends Applet{  
	  
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){g.drawString("Welcome",50, 50);}  
	public void paint1(Graphics g){g.drawString("sameer",50, 50);}  
}  
