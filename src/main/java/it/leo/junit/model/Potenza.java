package it.leo.junit.model;

public class Potenza {
    public static int calcPotenza(int base,int index){
        int result = 0;
        if(index==0 && base!=0)
            result=1;
        else if(base==0 && index!=0)
            result=0;
        else if(base==0 && index==0){
            System.out.println("ERRORE");
            return 0;
        }
        else if(base!=0 && index!=0){
            result=base;
            for (int i=1;i<index;i++) {
                result *= base;
            }
        }
        return result;
    }
}
