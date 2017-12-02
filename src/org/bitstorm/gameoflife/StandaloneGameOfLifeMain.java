package org.bitstorm.gameoflife;

import java.net.MalformedURLException;

import org.bitstorm.gameoflife.ui.StandaloneGameOfLifeAppletFrame;
import org.bitstorm.gameoflife.uicontrol.StandaloneGameOfLife;

public class StandaloneGameOfLifeMain {
	/**
	 * main() for standalone version.
	 * @param args Not used.
	 */
	public static void main(String args[]) throws MalformedURLException {
		new StandaloneGameOfLifeAppletFrame( "Game of Life", new StandaloneGameOfLife(args));
	}
}
