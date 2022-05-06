package com.bridgelabz;

public class Generics {// max number
    public void compareMax(Integer obj1, Integer obj2, Integer obj3) {
        if (obj1 > obj2 && obj1 > obj3)
            System.out.println( obj1 + " is maximum number among three numbers.");
        else if (obj2 > obj1 && obj2 > obj3)
            System.out.println(  obj2 + " is maximum number among three numbers.");
        else
            System.out.println( obj3 + " is maximum number among three numbers.");
    }

    public static void main(String[] args) {
        Generics obj = new Generics();
        obj.compareMax(12,10,9);

    }
}
