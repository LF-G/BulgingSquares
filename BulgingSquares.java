/*////////////////////////////////////////////////////////////////
//
// Autor: Luiz Fernando Galati                                                                                                 
//                                                                                                                              
///////////////////////////////////////////////////////////////*/



public class BulgingSquares {
    public static void main (String[] args) {    
        StdDraw.setXscale (0.0, 15.0);
        StdDraw.setYscale (0.0, 15.0);
        
        imprimeTabuleiro ();
        imprimePretos ();
        imprimeBrancos ();
    }
    
    
    /* Imprime na tela o tabuleiro de quadrados grandes.  */
    
    private static void imprimeTabuleiro () {
        double x, y;
        
        for (x = 0.5; x <= 14.5; x = x + 2.0)        
            for (y = 0.5; y <= 14.5; y = y + 2.0)
                StdDraw.filledSquare (x, y, 0.5);        
        for (x = 1.5; x <= 13.5; x = x + 2.0)
            for (y = 1.5; y <= 13.5; y = y + 2.0)
                StdDraw.filledSquare (x, y, 0.5);
    }
    
    
    /* Imprime os pequenos quadrados pretos no tabuleiro. */
    
    private static void imprimePretos () {
        double x, y;
        int i, j;
        
        // Vertical, centro //
        for (y = 6.83; y >= 2.83; y = y - 2.0) {        
            StdDraw.filledSquare (7.17, y, 0.12);
            StdDraw.filledSquare (7.83, y, 0.12);
        }
        for (y = 8.17; y <= 12.17; y = y + 2.0) {
            StdDraw.filledSquare (7.17, y, 0.12);
            StdDraw.filledSquare (7.83, y, 0.12);
        }
        
        // Horizontal, centro //
        for (x = 6.83; x >= 2.83; x = x - 2.0) {        
            StdDraw.filledSquare (x, 7.17, 0.12);
            StdDraw.filledSquare (x, 7.83, 0.12);
        }
        for (x = 8.17; x <= 12.17; x = x + 2.0) {
            StdDraw.filledSquare (x, 7.17, 0.12);
            StdDraw.filledSquare (x, 7.83, 0.12);
        }
        
        // Primeiro quadrante a partir do centro do tabuleiro //
        for (i = 8; i <= 13; i++) {
            for (j = 8; j <= 13; j++) {
                if ((i + j) % 2 == 1 && (i + j) < 22) {
                    x = i + 0.17;
                    y = j + 0.83;
                    StdDraw.filledSquare (x, y, 0.12);
                    x = i + 0.83;
                    y = j + 0.17;
                    StdDraw.filledSquare (x, y, 0.12);
                }
            }
        }
        
        // Segundo quadrante a partir do centro do tabuleiro //
        for (i = 8; i <= 13; i++) {
            for (j = 7; j >= 2; j--) {
                if ((i + j) % 2 == 0 && (i - j) <= 6) {
                    x = i + 0.83;
                    y = j - 0.17;
                    StdDraw.filledSquare (x, y, 0.12);
                    x = i + 0.17;
                    y = j - 0.83;
                    StdDraw.filledSquare (x, y, 0.12);
                }
            }
        }
        
        // Terceiro quadrante a partir do centro do tabuleiro //
        for (i = 7; i >= 2; i--) {
            for (j = 8; j <= 13; j++) {
                if ((i + j) % 2 == 0 && (j - i) <= 6) {
                    x = i - 0.83;
                    y = j + 0.17;
                    StdDraw.filledSquare (x, y, 0.12);
                    x = i - 0.17;
                    y = j + 0.83;
                    StdDraw.filledSquare (x, y, 0.12);
                }
            }
        }        
        
        // Quarto quadrante a partir do centro do tabuleiro //
        for (i = 7; i >= 2; i--) {
            for (j = 7; j >= 2; j--) {
                if ((i + j) % 2 == 1 && (i + j) > 8) {
                    x = i - 0.83;
                    y = j - 0.17;
                    StdDraw.filledSquare (x, y, 0.12);
                    x = i - 0.17;
                    y = j - 0.83;
                    StdDraw.filledSquare (x, y, 0.12);
                }
            }
        }
    }
    
    
    /* Imprime os pequenos quadrados brancos no tabuleiro. */
    
    private static void imprimeBrancos () {
        double x, y;
        int i, j;
        
        StdDraw.setPenColor (StdDraw.WHITE);
        
        // Vertical, centro //
        for (y = 5.83; y >= 1.83; y = y - 2.0) {        
            StdDraw.filledSquare (7.17, y, 0.12);
            StdDraw.filledSquare (7.83, y, 0.12);
        }
        for (y = 9.17; y <= 13.17; y = y + 2.0) {
            StdDraw.filledSquare (7.17, y, 0.12);
            StdDraw.filledSquare (7.83, y, 0.12);
        }        
        
        // Horizontal, centro //
        for (x = 5.83; x >= 1.83; x = x - 2.0) {        
            StdDraw.filledSquare (x, 7.17, 0.12);
            StdDraw.filledSquare (x, 7.83, 0.12);
        }
        for (x = 9.17; x <= 13.17; x = x + 2.0) {
            StdDraw.filledSquare (x, 7.17, 0.12);
            StdDraw.filledSquare (x, 7.83, 0.12);
        }        
        
        // Primeiro quadrante a partir do centro do tabuleiro //
        for (i = 8; i <= 13; i++) {
            for (j = 8; j <= 13; j++) {
                if ((i + j) % 2 == 0 && (i + j) < 21) {
                    x = i + 0.17;
                    y = j + 0.83;
                    StdDraw.filledSquare (x, y, 0.12);
                    x = i + 0.83;
                    y = j + 0.17;
                    StdDraw.filledSquare (x, y, 0.12);
                }
            }
        }
        for (x = 12.17, y = 10.83; x >= 10.17; x = x - 1.0, y = y + 1.0)
            StdDraw.filledSquare (x, y, 0.12);
        for (x = 12.83, y = 10.17; x >= 10.83; x = x - 1.0, y = y + 1.0)
            StdDraw.filledSquare (x, y, 0.12);        
        
        // Segundo quadrante a partir do centro do tabuleiro //
        for (i = 8; i <= 13; i++) {
            for (j = 7; j >= 2; j--) {
                if ((i + j) % 2 == 1 && (i - j) <= 5) {
                    x = i + 0.83;
                    y = j - 0.17;
                    StdDraw.filledSquare (x, y, 0.12);
                    x = i + 0.17;
                    y = j - 0.83;
                    StdDraw.filledSquare (x, y, 0.12);
                }
            }
        }        
        for (x = 2.17, y = 10.17; x <= 4.17; x = x + 1.0, y = y + 1.0)
            StdDraw.filledSquare (x, y, 0.12);        
        for (x = 2.83, y = 10.83; x <= 4.83; x = x + 1.0, y = y + 1.0)
            StdDraw.filledSquare (x, y, 0.12);        
        
        // Terceiro quadrante a partir do centro do tabuleiro //
        for (i = 7; i >= 2; i--) {
            for (j = 8; j <= 13; j++) {
                if ((i + j) % 2 == 1 && (j - i) <= 5) {
                    x = i - 0.83;
                    y = j + 0.17;
                    StdDraw.filledSquare (x, y, 0.12);
                    x = i - 0.17;
                    y = j + 0.83;
                    StdDraw.filledSquare (x, y, 0.12);
                }
            }
        }
        for (x = 2.17, y = 4.83; x <= 4.17; x = x + 1.0, y = y - 1.0)        
            StdDraw.filledSquare (x, y, 0.12);        
        for (x = 2.83, y = 4.17; x <= 4.83; x = x + 1.0, y = y - 1.0)
            StdDraw.filledSquare (x, y, 0.12);        
        
        // Quarto quadrante a partir do centro do tabuleiro  //
        for (i = 7; i >= 2; i--) {
            for (j = 7; j >= 2; j--) {
                if ((i + j) % 2 == 0 && (i + j) > 9) {
                    x = i - 0.83;
                    y = j - 0.17;
                    StdDraw.filledSquare (x, y, 0.12);
                    x = i - 0.17;
                    y = j - 0.83;
                    StdDraw.filledSquare (x, y, 0.12);
                }
            }
        }
        for (x = 10.17, y = 2.17; x <= 12.17; x = x + 1.0, y = y + 1.0)
            StdDraw.filledSquare (x, y, 0.12);
        for (x = 10.83, y = 2.83; x <= 12.83; x = x + 1.0, y = y + 1.0)
            StdDraw.filledSquare (x, y, 0.12); 
    }
    
}
