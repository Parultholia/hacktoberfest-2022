package Oops;

// Method overloading by changing number of arguments of a method.

/*class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}*/

/*
public class MethodOverloading {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(add(11,11));
        System.out.println(add(11,11,11));
    }
}*/

// Method overloading by changing data type of arguments.

/*class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(12.6,10.4));
    }
}*/

public class MethodOverloading {
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(11,11));
        System.out.println(add(12.6,10.4));
    }
}
