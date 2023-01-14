package Javaclass5_1;
//Hierarchical  inheritance
public class Test_Mathematics {
    public static void main(String[] args) {
        B_Mathematics obj_B = new B_Mathematics();
        obj_B.print_A();
        obj_B.print_B();

        C_Mathematics obj_C = new C_Mathematics();
        obj_C.print_A();
        obj_C.print_C();
    }
}