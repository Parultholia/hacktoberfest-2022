package Oops;

class Cats{
    public int eat(int c){

        return c+1;
    }
}
class Dogs{
    public int eat(){

        return 1;
    }
}
public class Animal {
    public static void main(String[] args) {
        Cats s=new Cats();
        Dogs t=new Dogs();

        int cEat= 0;
        int dEat= 0;

        cEat= s.eat(cEat);  // line number 4 function arg int c equals cEat inside the s.eat()
        cEat= s.eat(cEat);
        System.out.println("cat eats "+ cEat+ " times");
        System.out.println("dog eats "+ dEat+ " times");
    }
}
