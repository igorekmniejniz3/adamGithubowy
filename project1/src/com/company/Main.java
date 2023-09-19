package com.company;

public class Main {

    public static void main(String[] args) {
        LiczbaHolder lh1 = new LiczbaHolder(12);
        LiczbaHolder lh2 = new LiczbaHolder(44);
        System.out.println("lh1 = "+lh1.getA());
        /////////////////////////////
        GenericHolder gh1 = new GenericHolder(123);
        System.out.println("gh1 = "+gh1.getA());
        gh1.setA(444);
        System.out.println("gh1 = "+gh1.getA());
        ////////////////////////////
        ObjectHolder oh1 = new ObjectHolder("dsadsa");
        System.out.println("oh1 = "+oh1.getA());
        oh1.setA(123);
        System.out.println("oh1 = "+oh1.getA());
    }
}