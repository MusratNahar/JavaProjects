package Javaclass5;
//class & object
public class Class_Object {
    int Age;

    public Class_Object (String name) {
        // This constructor has one parameter, name.
        System.out.println("Name chosen is :" + name );
    }

    public void setAge( int age ) {
        Age = age;
    }

    public int getAge( ) {
        System.out.println("person's age is :" + Age );
        return Age;
    }

    public static void main(String []args) {
        /* Object creation */
        Class_Object  myclass = new Class_Object ( "Musrat" );


        myclass.setAge( 2 );


        myclass.getAge( );

        /* You can access instance variable as follows as well */
        System.out.println("Variable Value :" + myclass.Age );
    }
}
