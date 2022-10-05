package Oops;

class Bank{
    int getRateOfInterest() {
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class AXIS extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        SBI s= new SBI();
        ICICI i= new ICICI();
        AXIS a= new AXIS();
        System.out.println("Rate of interest of SBI bank is "+s.getRateOfInterest()+"%");
        System.out.println("Rate of interest of ICICI bank is "+i.getRateOfInterest()+"%");
        System.out.println("Rate of interest of AXIS bank is "+a.getRateOfInterest()+"%");
    }
}
