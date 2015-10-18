package com.tpe.genetique.core;

import java.awt.Toolkit;

public class Main {
	
	public static Frame frame;
	private static Toolkit toolkit;

	public static void main(String[] args) {
		toolkit = Toolkit.getDefaultToolkit();
		initFrame();
	}
	private static void initFrame(){
		try {
			frame = new Frame(toolkit.getScreenSize().width,toolkit.getScreenSize().height);
		}catch(Exception e){
			frame = new Frame(1024,768);
			e.printStackTrace();
		}
	}

}
