class Test {
    int a, b, c;

    void getData(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        c = a + b;
        System.out.println("Addition is;" + c);
    }
}

class Main {
    public static void main(String args[]) {
        Test obj = new Test();
        obj.getData(201, 22);
        obj.add();
    }
}
