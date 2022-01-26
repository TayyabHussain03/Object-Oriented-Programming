// Method overriding cannot be applied in private, static and constructor method

class Super{
    int x= 35;
    void disp(){
        System.out.println("Super Class"+ x);
    }
}

class Sub extends Super{
    int y = 10;
    void disp(){
        System.out.println("Sub Class"+ y);
        System.out.println("Super Class"+ x);
    }
}

class Test{
    public static void main(String args[]) {
        Sub obj = new Sub();
        obj.disp();
    }
}