
import myotherpackage.MyOtherClass;
import mypackage.MyClass;


public class Main{

    public static void main(String[] args){
        MyClass c1 = new MyClass();
        MyOtherClass c2 = new MyOtherClass();

        c1.PrintFromMyClass();
        c2.PrintFromMyClass();
    }
}