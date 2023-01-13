package Javaclass4;
//interface examples
public class AustralianTrafic implements CentralTraffic {
    public static void main(String[] args) {
    CentralTraffic a= new AustralianTrafic();
    a.greenGo();
    a.redStop();
    a.flashYellow();
        AustralianTrafic at = new AustralianTrafic();
        at.walksymbol();
    }
    //own method in australiantrafic
    public void walksymbol() {
        System.out.println("walksymbol implementation");
    }
//implements methods
    @Override
    public void greenGo() {
        System.out.println("Greengo implementation");

    }

    @Override
    public void redStop() {
        System.out.println("redstop implementation");

    }

    @Override
    public void flashYellow() {
        System.out.println("flashyellow implementation");

    }
}
