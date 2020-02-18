public class TableauxExploration {

    public static void initTen(int[][] tabResult) {
        int nbLignes = tabResult.length;
        int nbColonnes = tabResult[0].length;

        for(int i = 0; i < nbLignes; i++)
            for(int j = 0; j < nbColonnes; j++)
                tabResult[i][j] = 10;
    }

//    public static void initDiagonaleTen(int[][] tabResult) {
//        int nbLignes = tabResult.length;
//        int nbColonnes = tabResult[0].length;
//        int a = 0;
//        int b = 0;
//
//        for(int i = 0; i < nbLignes; i++)
//            a++;
//            for(int j = 0; j < nbColonnes; j++)
//                b++;
//                tabResult[a][b] = 10;
//    }

    public static void initPosition(String[][] tabResult) {
        int nbLignes = tabResult.length;
        int nbColonnes = tabResult[0].length;
        int p1 = 0;
        int p2 = 0;

        for(int i = 0; i < nbLignes; i++)
            for(int j = 0; j < nbColonnes; j++)
                tabResult[i][j] = p1 + ":" + p2;
            p1++;
            p2++;
    }

    public static boolean isTabCarre(int[][] tab) {
        int nbLignes = tab.length;
        int nbColonnes = tab[0].length;
        boolean carre;

        if(nbColonnes != nbLignes)
           carre = false;
        else
            carre = true;

        return carre;
    }


    public static boolean isTabDimEgal(int[][] tab1, int[][] tab2) {
        int nbLignes1 = tab1.length;
        int nbColonnes1 = tab1[0].length;
        int nbLignes2 = tab2.length;
        int nbColonnes2 = tab2[0].length;
        boolean equal;

        if(nbColonnes1 == nbColonnes2 && nbLignes1 == nbLignes2)
            equal = true;
        else
            equal = false;

        return equal;
    }

//    public static int[][] getSommeMatrices(int[][] matrice1, int[][] matrice2) {
//
//    }
}

