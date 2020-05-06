class A {
    static int initSA() {
        System.out.println("1");
        return 0;
    }

    static {
        System.out.println("2");
    }

    static int sa = initSA();

    int a = initA();

    int initA() {
        System.out.println("3");
        return 0;
    }

    {
        System.out.println("4");
    }

    A() {
        System.out.println("5");
    }
}

class B extends A {

    static int initSB() {
        System.out.println("6");
        return 0;
    }

    static {
        System.out.println("7");
    }

    static int sb = initSB();

    int b = initB();

    int initB() {
        System.out.println("8");
        return 0;
    }

    {
        System.out.println("9");
    }

    B() {
        System.out.println("10");
    }
}


public class InitOrder extends B {
    public static void main(String[] args) {
        System.out.println("11");
        new B();
        new B();
        System.out.println("12");
    }
}

//运行结果：2 1 7 6 11 3 4 5 8 9 10 3 4 5 8 9 10 12 