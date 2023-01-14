package Javaclass5;
// Class Polymorphism
public class Polymorphism_class {
    public static void main(String[] args)
    {

        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method

        a = new Subclass1();
        a.Print();

        a = new Subclass2();
        a.Print();
    }
}
