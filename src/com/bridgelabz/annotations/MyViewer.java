package com.bridgelabz.annotations;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;

@SuppressWarnings("deprecation")
public class MyViewer extends Frame{  
		  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public static void main(String[] args) throws Exception{  
		    Class c=Class.forName(args[0]);  
		          
		    MyViewer v=new MyViewer();  
		    v.setSize(400,400);  
		    v.setLayout(null);  
		    v.setVisible(true);  
		          
		    Applet a=(Applet)c.newInstance();  
		    a.start();  
		    Graphics g=v.getGraphics();  
		    a.paint(g);  
		    a.stop();  
		          
		  }  
		  
		}  
