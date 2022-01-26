class Roll {
    int x;

    void getRoll(int a) {
        x = a;

    }

    void dispRoll() {
        System.out.println("Roll Number of Student 1:" + "" + x);
    }
}

class Marks extends Roll {
    int m1, m2;

    void getMarks(int x, int y) {
        m1 = x;
        m2 = y;
    }

    void dispMarks() {
        System.out.println("Marks of Student" + "is" + " " + m1);
        System.out.println("Marks of Student" + "is" + " " + m2);
    }
}

class Result extends Marks {
    int total;

    void disp() {
        dispRoll();
        dispMarks();
        total = m1 + m2;
        System.out.println("Total is" + " " + total);
    }
}

class Main {
    public static void main(String args[]) {
        Result obj = new Result();
        obj.getRoll(101);
        obj.getMarks(722,921);
        obj.disp();
    }
}
