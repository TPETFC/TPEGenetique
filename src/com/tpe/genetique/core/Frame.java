package com.tpe.genetique.core;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.tpe.genetique.util.Constants;

public class Frame extends JFrame {

	private int screenWidth;
	private int screenHeight;

	public Frame(int screenWidth, int screenHeight) {
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.initFrame();
	}
	private void initFrame(){
		if(screenWidth < 800 || screenHeight < 600){
			JOptionPane.showMessageDialog(null, "La résolution de votre moniteur ne permet pas l'exécution de ce programme","Erreur",JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
		this.setTitle(Constants.TITLE);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
	}

}
