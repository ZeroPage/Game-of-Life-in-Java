package org.bitstorm.gameoflife.eventhandler.menu;

import org.bitstorm.gameoflife.fileIO.CellGridIO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WriteMenuItemHandler implements ActionListener {
	private CellGridIO gridIO;
	public WriteMenuItemHandler(CellGridIO gridIO){
		this.gridIO = gridIO;
	}
	@Override
	public synchronized void actionPerformed(ActionEvent e) {
		gridIO.saveShape();
	}
}
