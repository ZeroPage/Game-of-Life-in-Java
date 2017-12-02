package org.bitstorm.gameoflife.cells;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by elwlw on 2017-12-02.
 */
public class CellTest {
    @Test
    public void testEquals() throws Exception {
        Cell c1= new Cell(1,1);
        Cell c2= new Cell(1,2);
        Cell c3= new Cell(1,1);
        Object o1= new Object();
        assertEquals(c1, c3);
        assertNotEquals(c1, c2);
        assertNotEquals(c1, o1);
    }

    @Test
    public void testHashCode() throws Exception {
        Cell c1= new Cell(1,1);
        assertEquals(c1.hashCode(), 5001);
    }

    @Test
    public void testToString() throws Exception {
        Cell c1= new Cell(1,1);
        assertEquals(c1.toString(), "Cell at (1, 1) with 0 neighbours");
        c1.neighbour=1;
        assertEquals(c1.toString(), "Cell at (1, 1) with 1 neighbour");
    }

}