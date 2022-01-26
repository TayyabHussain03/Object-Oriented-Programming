// class SingleInheritance {
//     int a;
//     int b;

//     void getData(int x, int y) {
//         a = x;
//         b = y;
//     }

//     int add() {
//         System.out.println("Super class Method");
//         return (a + b);
//     }
// }

// class B extends SingleInheritance {
//     int multiply() {
//         System.out.println("Sub class Method");
//         return (a * b);
//     }
// }

// class Main {
//     public static void main(String args[]) {
//     B obj = new B();
//        int add , multiply;
//        obj.getData(4,5);
//        add = obj.add();
//        multiply = obj.multiply();
//        System.out.println("Multiplication is" + multiply);
//        System.out.println("Addition is" + add);
//     }
// }