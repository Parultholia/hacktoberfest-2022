package Oops;

public class Recursion {
   /* static int count=0;
     public static void m1(){
        count++;
        if(count<=10){
            System.out.println(2*count);
            m1();
        }
    }*/

    // Factorial of number using recursion

    /* static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return(n + factorial(n-1));
    }
    public static void main(String[] args) {
        int f=factorial(5);
        System.out.println(f);
    }
}*/

    //Fibonacci series using recursion

    static int n1=0,n2=1,n3=0;
    static void printFibo(int count){
        if(count>0){
            n3 = n1 + n2;  // 0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8
            n1 = n2;       // 1    , 1    , 2    , 3    , 5
            n2 = n3;       // 1    , 2    , 3    , 5    , 8
            System.out.print(" "+n3); // 1 2 3 5 8
            printFibo(count-1); // p(4) p(3) p(2) p(1) p(0)
        }
    }
    public static void main(String[] args) {
        System.out.print("0 ");
        System.out.print("1");
        printFibo(5);

    }
}

