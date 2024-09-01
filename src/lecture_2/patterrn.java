package lecture_2;

public class patterrn {
    public static void main (String args []){

        for(char row ='E';row >='A';row--){
            for(char cst=row;cst >='A';cst--){
                System.out.print(cst);
            }
            System.out.println();
        }
    }
}
