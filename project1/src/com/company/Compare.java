package com.company;

public class Compare<T extends Comparable> {
    public boolean compareValues(T a, T b){
        if (a.compareTo(b) > 0) {
            System.out.println(a+" jest większa od "+b);
            return true;
        }
        if (a.compareTo(b) < 0) {
            System.out.println(a+" jest mniejsza od "+b);
            return true;
        }
        System.out.println(a+" jest równe "+b);
        return false;
    }
//    public boolean compareValues(int a, int b){
//        if (a < b) {
//            System.out.println(a+" jest mniejsze od "+b);
//            return false;
//        }
//        if (a > b) {
//            System.out.println(a+" jest większe od "+b);
//            return true;
//        }
//        System.out.println(a+" jest równe "+b);
//        return false;
//    }
//    public boolean compareValues(float a, float b){
//        if (a < b) {
//            System.out.println(a+" jest mniejsze od "+b);
//            return false;
//        }
//        if (a > b) {
//            System.out.println(a+" jest większe od "+b);
//            return true;
//        }
//        System.out.println(a+" jest równe "+b);
//        return false;
//    }
//    public boolean compareValues(double a, double b){
//        if (a < b) {
//            System.out.println(a+" jest mniejsze od "+b);
//            return false;
//        }
//        if (a > b) {
//            System.out.println(a+" jest większe od "+b);
//            return true;
//        }
//        System.out.println(a+" jest równe "+b);
//        return false;
//    }
//    public boolean compareValues(byte a, byte b){
//        if (a < b) {
//            System.out.println(a+" jest mniejsze od "+b);
//            return false;
//        }
//        if (a > b) {
//            System.out.println(a+" jest większe od "+b);
//            return true;
//        }
//        System.out.println(a+" jest równe "+b);
//        return false;
//    }
//    public boolean compareValues(String a, String b){
//        if (a.compareTo(b) > 0) {
//            System.out.println(a+" jest większa od "+b);
//            return true;
//        }
//        if (a.compareTo(b) < 0) {
//            System.out.println(a+" jest mniejsza od "+b);
//            return true;
//        }
//        System.out.println(a+" jest równe "+b);
//        return false;
//    }
}
