package Javaclass4;

// local, instance and class variable
public class JavaVariables {
    public String name; //instance variable
    private double salary;

    private static double esalary;  //class /static variables
    public static final String DEPARTMENT = "Development "; //class /static variables
    public void Employee (String employname) {
        name=employname;
    }
    public void setSalary (double employeesalary) {
        salary=employeesalary;
    }
    public void printEmp() {
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
    }
    //local variable example
    public void ChildAge() {
        int age = 0; //local variable
        age = age + 7;
        System.out.println("Child age is : " + age);
    }
    public static void main(String[] args) {

        //Instance vairiable example
        JavaVariables emp = new JavaVariables();
        emp.Employee("Musrat");
        emp.setSalary(15000); //Instance vairiable example
        emp.printEmp(); //Instance vairiable example


        //Class/Static Variables

        esalary = 1000;
       System.out.println(DEPARTMENT + "average salary:" + esalary);


        //local variable example
        JavaVariables age = new JavaVariables();//local variable example
        age.ChildAge();


    }
}
