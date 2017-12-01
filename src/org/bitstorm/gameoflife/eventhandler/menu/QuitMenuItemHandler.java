package org.bitstorm.gameoflife.eventhandler.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuitMenuItemHandler implements ActionListener {
	@Override
	public synchronized void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
