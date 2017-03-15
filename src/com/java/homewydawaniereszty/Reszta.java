package com.java.homewydawaniereszty;

/**
 * Created by User on 2017-03-15.
 */
public class Reszta {

    private int i = 0;
    private int N[] = {200, 100, 50, 20, 10, 5, 2, 1};
    private int l;

    public double rekurencja (double r){
        if (r <= 0 ){
            return 1;
        } else {
            if (r >= N[i]){
                this.l = (int) r/N[i];
                System.out.println(l + "x  " + N[i]+ "zł");
                r = r-(N[i]*this.l);
                i++;
            } else {
                i++;}
        }
        return rekurencja(r);
    }
}
