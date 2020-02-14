public class TableauxExploration {

    public static void initTen(int[][] tabResult) {
        int nbLignes = tabResult.length;
        int nbColonnes = tabResult[0].length;

        for(int i = 0; i < nbLignes; i++)
            for(int j = 0; j < nbColonnes; j++)
                tabResult[i][j] = 10;
    }

    public static void initDiagonaleTen(int[][] tabResult) {
        int nbLignes = tabResult.length;
        int nbColonnes = tabResult[0].length;

        for(int i = 0; i < nbLignes; i++)
            for(int j = 0; j < nbColonnes; j++)

    }

    public static void initPosition(String[][] tabResult) {

    }

//    public static boolean isTabCarre(int[][] tab) {
//    }
//
//
//    public static boolean isTabDimEgal(int[][] tab1, int[][] tab2) {
//
//    }
//
//    public static int[][] getSommeMatrices(int[][] matrice1, int[][] matrice2) {
//
//    }
}

