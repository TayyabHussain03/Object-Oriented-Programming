interface A {
    int number = 2234;

    void disp();
}

interface B {
    void dispb();
}

class C implements A, B {
    public void disp() {
        System.out.println("Interface A" + number);
    }

    public void dispb() {
        System.out.println("Interface B" + number);
    }
}

class Test {
    public static void main(String args[]) {
        C obj = new C();
        obj.disp();
        obj.dispb();
    }
}