/* 
1.Mata in krupto

2.Skriv ut krypto
H�ll reda p� vilka siffror som har ett tecken i nyckeln
Det ska vara n�gon form av layot, ramar eller grafik eller liknande liknande

3.Mata in  nyckel
Hur ska jag h�lla koll p� vad jag matar in, s� att r�tt bockastv hamnar p� r�tt plats.
"14 = T" pasa efter = och allt f�re �r ett tal och ett tecken
"T = 14! samma fast tv�rtom. 
*/

public class Start {

    static void println(String stringtoprint){
        System.out.println(stringtoprint);
    }

    static void showGrid(int[][] krypto, char[] key){
        int width = krypto[0].length;

        StringBuilder sb = new StringBuilder("+");
        for(int i = 0; i < width; i++) {
            sb.append("--+");
        }
        String breakingLine = sb.toString();

        System.out.println(breakingLine);
        for(int[] row : krypto) {
            System.out.print("|");
            for(int x : row) {
                char c = key[x];
                String s = Character.toString(c);
                if(c == 0) {
                    s = Integer.toString(x);
                }

                String output = String.format("%2s", s);
                System.out.print(output);
                System.out.print("|");
            }
            System.out.println();
            System.out.println(breakingLine);
          //rad 12
            krypto[12][0] = 5;
            krypto[12][1] = 4;
            krypto[12][2] = 5;
            krypto[12][3] = 4;
            krypto[12][4] = 4;
            krypto[12][5] = 5;
            krypto[12][6] = 4;
            krypto[12][7] = 5;
            krypto[12][8] = 4;
            krypto[12][9] = 5;
            krypto[12][10] = 5;
            krypto[12][11] = 4;
            krypto[12][12] = 5;
            krypto[12][13] = 4;
            krypto[12][14] = 5;
            // rad 13
            krypto[13][0] = 5;
            krypto[13][1] = 4;
            krypto[13][2] = 5;
            krypto[13][3] = 4;
            krypto[13][4] = 4;
            krypto[13][5] = 5;
            krypto[13][6] = 4;
            krypto[13][7] = 5;
            krypto[13][8] = 4;
            krypto[13][9] = 5;
            krypto[13][10] = 5;
            krypto[13][11] = 4;
            krypto[13][12] = 5;
            krypto[13][13] = 4;
            krypto[13][14] = 5;
            // rad 14
            krypto[14][0] = 5;
            krypto[14][1] = 4;
            krypto[14][2] = 5;
            krypto[14][3] = 4;
            krypto[14][4] = 4;
            krypto[14][5] = 5;
            krypto[14][6] = 4;
            krypto[14][7] = 5;
            krypto[14][8] = 4;
            krypto[14][9] = 5;
            krypto[14][10] = 5;
            krypto[14][11] = 4;
            krypto[14][12] = 5;
            krypto[14][13] = 4;
            krypto[14][14] = 5;
            //rad 15

            char key [] = new char [30];
            key[5] = 'A';
            key[4] = 'P';
            showGrid(krypto, key);
        }
    }
        }
    }



    public static void main(String[] args) {
        int sizeX=15, sizeY=15; //Kryptots storlek
        int[][] krypto = new int[sizeY][sizeX];