class Student {
    float totalNumber;

    void add(int x, int y) {
        totalNumber = x + y;
        System.out.println("Total Number of Student1 is" + " " + totalNumber);
    }

    void add(int x, int y, int z){
        totalNumber = x + y + z;
        System.out.println("Total Number of Student2 is" + " " + totalNumber);
    }
}

class MethodOverloading{
    public static void main(String args[]){
        Student obj = new Student();
        obj.add(75,98);
        obj.add(88,92,94);
    }
}

// In polymorphism MethodOverloading method we can make method with same class name but number arguments can not be same. 
// If number of arguments would be same so data type of parameters can not be same.