package org.bitstorm.gameoflife.eventhandler.menu;

import org.bitstorm.util.TextFileDialog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LicenseMenuItemHandler implements ActionListener {
	private Frame frame;
	public LicenseMenuItemHandler(Frame frame){
		this.frame = frame;
	}
	@Override
	public synchronized void actionPerformed(ActionEvent e) {
		Point p = frame.getLocation();
		new TextFileDialog( frame, "Game of Life License", "license.txt", p.x+60, p.y+60 );
	}
}
