package oops;

//  compole time 
// class calculate {
// int add( int a , int b){
//     return a+b;
// }
// int add( int c , int d , int e){
//     return c+d+e;
// }}
// run time 
class animal {

    void sound() {
        System.out.println("animal bark ");
    }
}

class dog extends animal {

    void sound() {
        System.out.println("bho bho ");
    }
}

class cat extends animal {

    void sound() {
        System.out.println("meo meo ");
    }
}

class cow extends animal {

    void sound() {
        System.out.println("mo mo mo  ");
    }
}

public class inheritance {

    public static void main(String[] args) {
        // { inheritance is a class that acquire the property of another class. it
        // support code resuability
        // single inheritance , multiple and herarchial

        // polymorphism allow method to perform different task based on the object that
        // call them.
        // run time and compile time }
        // compile time
        // calculate calc = new calculate();
        // System.out.println(calc.add(2,3));
        // System.out.println(calc.add(3,4,5));
        // run time
        animal animal1 = new dog();
        animal animal2 = new cat();

        animal1.sound();
        animal2.sound();
    }
}
