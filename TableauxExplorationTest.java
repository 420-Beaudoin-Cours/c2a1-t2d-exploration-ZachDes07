import javafx.scene.control.Tab;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author France Beaudoin
 */
public class TableauxExplorationTest {

    @Test
    public void initTen() {
        int[][] tabResult = new int[2][5];
        int[][] tabExpected = {{10,10,10,10,10},{10,10,10,10,10}};
        TableauxExploration.initTen(tabResult);
        assertArrayEquals(tabExpected, tabResult);
    }

    @Test
    public void initDiagonaleTen() {
        int[][] tabResult = new int[5][5];
        int[][] tabExpected =   {{10,0,0,0,0},
                                {0,10,0,0,0},
                                {0,0,10,0,0},
                                {0,0,0,10,0},
                                {0,0,0,0,10}};
        TableauxExploration.initDiagonaleTen(tabResult);
        assertArrayEquals(tabExpected, tabResult);
    }

    @Test
    public void initPosition() {
        String[][] tabResult = new String[3][4];
        String[][] tabExpected = {{"0:0","0:1","0:2","0:3"},
                                {"1:0","1:1","1:2","1:3"},
                                {"2:0","2:1","2:2","2:3"}};
        TableauxExploration.initPosition(tabResult);
        assertArrayEquals(tabExpected, tabResult);
    }

    @Test
    public void isTabCarre() {
        int[][] tab = new int[3][3];
        assertTrue(TableauxExploration.isTabCarre(tab));

        tab = new int[3][4];
        assertFalse(TableauxExploration.isTabCarre(tab));
    }

    @Test
    public void isTabDimEgal() {
        int[][] tab1 = new int[2][3];
        int[][] tab2 = new int[2][3];
        assertTrue(TableauxExploration.isTabDimEgal(tab1, tab2));

        tab2 = new int[4][5];
        assertFalse(TableauxExploration.isTabDimEgal(tab1, tab2));
    }

    @Test
    public void getSommeMatrices() {
        int[][] matrice1 = {{1,2}, {0,4}};
        int[][] matrice2 = {{4,-6}, {7,8}};
        int[][] matriceSommeExpected = {{5,-4}, {7,12}};
        int[][] matriceSomme = TableauxExploration.getSommeMatrices(matrice1, matrice2);
        assertArrayEquals(matriceSommeExpected, matriceSomme);
    }
}