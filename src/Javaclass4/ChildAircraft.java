package Javaclass4;
//Abstract class example
public class ChildAircraft extends ParentAircraft {
    public static void main(String[] args) {
        ChildAircraft c= new ChildAircraft();
        c.safetyGuideline();
        c.engine();
        c.bodycolor();


    }

    @Override
    public void bodycolor() {
        System.out.println("Body color is black");

    }
}
