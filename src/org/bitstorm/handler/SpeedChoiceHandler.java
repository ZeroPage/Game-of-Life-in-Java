package org.bitstorm.handler;

import org.bitstorm.gameoflife.GameOfLifeControls;
import org.bitstorm.gameoflife.GameOfLifeControlsEvent;
import org.bitstorm.gameoflife.GameOfLifeControlsListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Enumeration;
import java.util.Vector;

public class SpeedChoiceHandler implements ItemListener {
	private Vector listeners;
	
	public SpeedChoiceHandler(Vector listener){
		this.listeners = listener;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String arg = (String) e.getItem();
		if (GameOfLifeControls.SLOW.equals(arg)) // slow
			speedChanged(1000);
		else if (GameOfLifeControls.FAST.equals(arg)) // fast
			speedChanged(100);
		else if (GameOfLifeControls.HYPER.equals(arg)) // hyperspeed
			speedChanged(10);
	}
	
	/**
	 * Called when a new speed from the speed pull down is selected.
	 * Notify event-listeners.
	 */
	private void speedChanged( int speed ) {
		GameOfLifeControlsEvent event = GameOfLifeControlsEvent.getSpeedChangedEvent( this, speed );
		for (Enumeration e = listeners.elements(); e.hasMoreElements(); ) {
			((GameOfLifeControlsListener) e.nextElement()).speedChanged(event);
		}
	}
}
