package junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitGameOfLife {


    @Test
    public void testGameOfLife() {
    	
    	
    	// Rule #1: Any living cell with fewer than 2 living neighbors dies.
    	System.out.println("Testing Rule 1");
        boolean[][] inputBoard1 = {
                {false, false, false},
                {false, true, false},
                {false, true, false}
        };
        boolean[][] expectedBoard1 = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };
        assertArrayEquals(expectedBoard1, (new GameOfLife()).getNextGeneration(inputBoard1));
        
        
        
        // Rule #2: Any living cell with 2 or 3 living neighbors lives on.
    	System.out.println("Testing Rule 2");
        boolean[][] inputBoard2 = {
                {true, true, false},
                {true, false, false},
                {false, false, false}
        };
        boolean[][] expectedBoard2 = {
                {true, true, false},
                {true, true, false},
                {false, false, false}
        };
        assertArrayEquals(expectedBoard2, (new GameOfLife()).getNextGeneration(inputBoard2));

        
        
        // Rule #3: Any living cell with more than 3 living neighbors dies.
    	System.out.println("Testing Rule 3");
        boolean[][] inputBoard3 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        boolean[][] expectedBoard3 = {
                {true, false, true},
                {false, false, false},
                {true, false, true}
        };
        assertArrayEquals(expectedBoard3, (new GameOfLife()).getNextGeneration(inputBoard3));

        
        
        // Rule #4: Any dead cell with exactly 3 living neighbors becomes alive.
    	System.out.println("Testing Rule 4");
        boolean[][] inputBoard4 = {
                {true, true, true},
                {false, false, false},
                {false, false, false}
        };
        boolean[][] expectedBoard4 = {
                {false, true, false},
                {false, true, false},
                {false, false, false}
        };
        assertArrayEquals(expectedBoard4, (new GameOfLife()).getNextGeneration(inputBoard4));

    }
}