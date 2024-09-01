public class Patternprinting4 {

    public static void main(String[] args) {

int j;
        for(int i = 0; i <= 3; i++){
            for(j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }///*
        ////**/
        ////***/*
        ////**
        ///*
        for(int i = 2; i >= 0; i--){
            for(j = 0; j< i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
