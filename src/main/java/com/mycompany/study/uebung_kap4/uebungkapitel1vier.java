package com.mycompany.study.uebung_kap4;

public class uebungkapitel1vier {
   
    public static void main(String[] args) {
        int d = 1, e = 2;
        System.out.println(("d= ") + d);
        System.out.println(("e= ") + e);
        System.out.println();
        d *= e;        
        System.out.println(("d= ") + d);
        System.out.println(("e= ") + e);
        System.out.println();       
        d += e++;
        System.out.println(("d= ") + d);
        System.out.println(("e= ") + e);
        System.out.println();
        d = 3 - 2 * e;
        System.out.println(("d= ") + d);
        System.out.println(("e= ") + e);
        System.out.println();
        e /= (d + 1);
        System.out.println(("d= ") + d);
        System.out.println(("e= ") + e);
        System.out.println();

    }
    
}
