package org.bitstorm.gameoflife;

import java.net.MalformedURLException;

import org.bitstorm.gameoflife.ui.AppletFrame;
import org.bitstorm.gameoflife.uicontrol.StandaloneGameOfLife;

public class main {
	/**
	 * main() for standalone version.
	 * @param args Not used.
	 */
	public static void main(String args[]) throws MalformedURLException {
		new AppletFrame( "Game of Life", new StandaloneGameOfLife(args));
	}
}
