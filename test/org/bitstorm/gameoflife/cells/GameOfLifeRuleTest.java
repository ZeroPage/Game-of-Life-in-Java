package org.bitstorm.gameoflife.cells;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by elwlw on 2017-12-02.
 */
public class GameOfLifeRuleTest {
    GameOfLifeRule glr;
    @Before
    public void setUp() throws Exception {
        glr= new GameOfLifeRule();
    }
    @Test
    public void diesNext() throws Exception {
        Cell c1= new Cell(1,1);
        c1.neighbour=0;
        assertTrue(glr.diesNext(c1));
        c1.neighbour=1;
        assertTrue(glr.diesNext(c1));
        c1.neighbour=2;
        assertFalse(glr.diesNext(c1));
        c1.neighbour=3;
        assertFalse(glr.diesNext(c1));
        c1.neighbour=4;
        assertTrue(glr.diesNext(c1));
        c1.neighbour=5;
        assertTrue(glr.diesNext(c1));
        c1.neighbour=6;
        assertTrue(glr.diesNext(c1));
        c1.neighbour=7;
        assertTrue(glr.diesNext(c1));
        c1.neighbour=8;
        assertTrue(glr.diesNext(c1));
    }

    @Test
    public void bornsNext() throws Exception {
        Cell c1= new Cell(1,1);
        c1.neighbour=0;
        assertFalse(glr.bornsNext(c1));
        c1.neighbour=1;
        assertFalse(glr.bornsNext(c1));
        c1.neighbour=2;
        assertFalse(glr.bornsNext(c1));
        c1.neighbour=3;
        assertTrue(glr.bornsNext(c1));
        c1.neighbour=4;
        assertFalse(glr.bornsNext(c1));
        c1.neighbour=5;
        assertFalse(glr.bornsNext(c1));
        c1.neighbour=6;
        assertFalse(glr.bornsNext(c1));
        c1.neighbour=7;
        assertFalse(glr.bornsNext(c1));
        c1.neighbour=8;
        assertFalse(glr.bornsNext(c1));
    }

}