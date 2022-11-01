package classwork.day9;

public class Runner {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
//        TheClass theClass = new TheClass();
        mc.justMethod((x) -> new ClassX(x) );

//        mc.justMethod(new IMyInterface() {
//            @Override
//            public double doSomething() {
//                return 3.14;
//            }
//        });
    }
}
