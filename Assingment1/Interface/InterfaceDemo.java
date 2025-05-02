interface InterfaceDemo1{
    int i = 10;
    static void staticMethod(){
        System.out.println("Static Method Inside Interface");
        privateMethod();
    }
    default void print(){
        System.out.println("Default Method Inside InterfaceDemo");
    }
    void abstractMethod();

    private static void privateMethod(){
        System.out.println("Private Method Inside Interface");
    }

    // protected static void protectedMethod(){
    //     System.out.println("Protected Method Inside Interface");
    // } // Illegal modifier for the interface method protectedMethod; only public, private, abstract, default, static and strictfp are permittedJava(67109935)

}

interface InterfaceDemo2 extends InterfaceDemo1{
    // a=10 from Interface demo is accessible but hidden
    int i = 20; // shadowing
}

abstract class AbstractClass implements InterfaceDemo1{
    // void demo(){
    //     InterfaceDemo1.print(); // Cannot Access Interface Defualt Methods From Abstract Class!
    // }

    void demo1(){
        System.out.println("Concrete Method Inside Abstract Class!");
        InterfaceDemo1.staticMethod();
    }
}

class SingleLevel implements InterfaceDemo1{
    // static int i = 100; // shadowing
    // public void print(){
    //     System.out.println("Overridden Method Inside SingleLevel");
    // } // overridding
    // public static void main(String [] args){
    //     System.out.println("Class SingleLevel");
    //     System.out.println("i From InterfaceDemo1: "+i);
    //     SingleLevel l1 = new SingleLevel();
    //     l1.print();
    // }

    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method Implemented in SingleLevel");
    }
    public static void main(String [] args){
        System.out.println("Class SingleLevel");
        System.out.println("i From InterfaceDemo1: "+i);
        // i=20;  we cannot reassign since interface variables are static && final implicitly
        SingleLevel l1 = new SingleLevel();
        l1.print();
        l1.abstractMethod();
    }
}


class MultiLevel implements InterfaceDemo2{
    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method Implemented In Multilevel ");
    }
    public static void main(String[] args) {
        System.out.println("Class MultiLevel");
        System.out.println("i From A: "+i);
        System.out.println("i From IterfaceDemo: "+InterfaceDemo1.i);
    }
}