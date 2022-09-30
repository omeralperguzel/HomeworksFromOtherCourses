package PatikaJava101.Practice;

public class IkiBoyutluDizilerleBHarfiYazma1 {

    public static void main(String[] args) {
        
        String[][] letter = new String[7][4];

        //i dikey j yatay

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                /*if (i == 0 || i == 6) {
                    letter[i][j] = " * ";
                }*/ 
                if (j == 0 || j == 3) {
                    if (i != 0 && i != 3 && i != 6){
                        letter[i][j] = " * ";
                    }
                    else{
                        letter[i][j] = "   ";
                    }
                } 
                else {
                    letter[i][j] = "   ";
                }
            }
            for (int j = 0; j < letter[i].length-1; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                }
            }
 
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    
}
