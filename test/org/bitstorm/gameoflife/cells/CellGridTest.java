package org.bitstorm.gameoflife.cells;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by elwlw on 2017-12-02.
 */

public class CellGridTest {
    public class ConcCellGrid extends CellGrid{
        public ConcCellGrid(int cellCols, int cellRows){
            super(cellCols, cellRows);
        }
    }
    private ConcCellGrid cg1;
    @Before
    public void setUp() throws Exception {
        cg1= new ConcCellGrid(10, 10);
    }

    @Test
    public void next() throws Exception {
        assertEquals(cg1.getGenerations(), 0);
        cg1.next();
        assertEquals(cg1.getGenerations(), 1);
        cg1.setCell(1,1,true);
        cg1.next();
        assertEquals(cg1.grid[1][1].neighbour, 0);
        assertEquals(cg1.grid[0][0].neighbour, 1);
        assertEquals(cg1.grid[1][0].neighbour, 1);
        assertEquals(cg1.grid[2][0].neighbour, 1);
        assertEquals(cg1.grid[0][1].neighbour, 1);
        assertEquals(cg1.grid[2][1].neighbour, 1);
        assertEquals(cg1.grid[0][2].neighbour, 1);
        assertEquals(cg1.grid[1][2].neighbour, 1);
        assertEquals(cg1.grid[2][2].neighbour, 1);
    }

    @Test
    public void addNeighbour() throws Exception {
        assertEquals(cg1.grid[1][1].neighbour, 0);
        cg1.addNeighbour(1,2);
        assertEquals(cg1.grid[1][2].neighbour, 1);
        cg1.addNeighbour(1,2);
        assertEquals(cg1.grid[1][2].neighbour, 2);
    }

    @Test
    public void setCell() throws Exception {
        cg1.setCell(1, 1, true);
        assertTrue(cg1.getCell(1,1));
        assertFalse(cg1.getCell(1,2));
    }

    @Test
    public void resize() throws Exception {
        assertEquals(cg1.getCellCols(), 10);
        assertEquals(cg1.getCellRows(), 10);
        cg1.resize(5,5);
        assertEquals(cg1.getCellCols(), 5);
        assertEquals(cg1.getCellRows(), 5);
    }

    @Test
    public void clear() throws Exception {
    }

}