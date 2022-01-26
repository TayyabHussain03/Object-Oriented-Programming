abstract class X {
    abstract void table();

    int x;

    void printTable(int z) {
        x = z;
        for (int y = 1; y <= 10; y++) {
            System.out.println(x + "x" + y + "=" + x * y );
        }
    }
}

class Sub extends X {
    void table() {
        System.out.println("This is table of 2");
    }
}

class Main {
    public static void main(String args[]) {
        Sub obj = new Sub();
        obj.table();
        obj.printTable(2);
    }
}