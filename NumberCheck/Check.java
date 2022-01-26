class Check {
    int a;

    void checkIf(int num) {
        a = num;
    }

    void checkValue() {
        if (a <= 0) {
            System.out.println("Number is less than 0");
        } else {
            System.out.println("Number is greater than 0");
        }
    }
}

class Main {
    public static void main(String args[]) {
        Check obj = new Check();
        obj.checkIf(-1);
        obj.checkValue();
    }
}
