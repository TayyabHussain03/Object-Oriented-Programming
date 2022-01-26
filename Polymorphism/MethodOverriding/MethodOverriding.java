class Pet {
    int pet = 2;

    void cat() {
        System.out.println("My Pet age is" + " " + pet);
    }
}

class favouritePet extends Pet {
    int pet2;

    void cat() {
        pet2 = 4;
        System.out.println("My Pet age is" + " " + pet);
        System.out.println("My Pet age is" + " " + pet2);
    }
}

class MethodOverriding {
    public static void main(String args[]) {
        favouritePet obj = new favouritePet();
        obj.cat();
    }
}

// In methodOverriding we can make same method with same class name and parameter with same parameter type
// but this type of polymorphism possibles in inheritance.