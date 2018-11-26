package template_method;

public class SomeMethod {
    private static void step1(){}
    private static void step4(){}
    public static void smth(){
        step1();
        Meth1.step2();
        Meth2.step3();
        step4();
    }
}
