package com.bridgelabz;

public class Generics {

    public void compareMax(Integer obj1, Integer obj2, Integer obj3) {// max int number m1
        if (obj1 > obj2 && obj1 > obj3)
            System.out.println(obj1 + " is maximum number among three numbers.");
        else if (obj2 > obj1 && obj2 > obj3)
            System.out.println(obj2 + " is maximum number among three numbers.");
        else
            System.out.println(obj3 + " is maximum number among three numbers.");
    }

    public void FloatMax(Float object1, Float object2, Float object3) {//max float m2
        if (object1 > object2 && object1 > object3)
            System.out.println(object1 + " is maximum number among three numbers.");
        else if (object2 > object1 && object2 > object3)
            System.out.println(object2 + " is maximum number among three numbers.");
        else
            System.out.println(object3 + " is maximum number among three numbers.");
    }

    public static String getLongestString(String[] array) {// max string m3
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        Generics obj = new Generics();
        obj.compareMax(12, 10, 9);
        obj.FloatMax(1.0f, 2.0f, 3.0f);
        String[] fruits = {"apple", "banana", "peach"};
        String longestString = getLongestString(fruits);
        System.out.format("longest string: '%s'\n", longestString);
    }


}

