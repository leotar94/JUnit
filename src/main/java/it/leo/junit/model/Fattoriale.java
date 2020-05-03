package it.leo.junit.model;

public class Fattoriale {
    public static int calcFatt(int fatt){
        int x=1;
        for(int i = 1; i<=fatt; i++)
            x*=i;
        return x;
    }
}
