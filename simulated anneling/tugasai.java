/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ainun
 */
import java.util.Random;
public class tugasai {
    
  
   static double fungsihitung(double x1, double x2){
       double xa1 = Math.pow(x1,2);
       double xa2 = Math.pow(x2,2);
       double h= -Math.abs(Math.sin(x1)*Math.cos(x2)*(Math.exp(Math.abs(1-((Math.sqrt(xa1+xa2))/3.14)))));
       return h;
    }
    static double acak(float x1,float x2){
        return x2*Math.random()+x1;
    }
    public static void main(String[] args) {
        double x1,x2,tmp;
        x1 = acak(-10,10);
        x2 = acak (-10,10);

        tmp = 10;
        double perhitungan = fungsihitung(x1,x2);
        double xa1,xa2,perhitunganac,e;
        while (tmp>0) {            
            xa1=acak(-10,10);
            xa2=acak(-10,10);
            perhitunganac=fungsihitung(xa1, xa2);
            if(perhitunganac<perhitungan){
                x1=xa1;
                x2=xa2;
                perhitungan=perhitunganac;
            }else{
                e=perhitunganac-perhitungan;
                if(Math.exp(-e/tmp)>acak(0,1)){
                    x1=xa1;
                    x2=xa2;
                    perhitungan=perhitunganac;
                }
            }
            tmp-=0.0034912;
        }
        System.out.println("nilai x1   :"+x1);
        System.out.println("nilai x2   :"+x2);
        System.out.println("hasil perhitungan:"+perhitungan);
        System.out.println("temp    : "+tmp);
    }
}


