package com.sb.SpringBootMay2026.controller;


class A {

    int x = 10;

    A() {
        print();
    }

    void print() {
        System.out.println("A : " + x);
    }
}

class B extends A {

    int x = 20;

    B() {
        super();
        print();
    }

    void print() {
        System.out.println("B : " + x);
    }
}

class C extends B {

    int x = 30;

    C() {
        print();
    }

    void print() {
        System.out.println("C : " + x);
    }
}

class DontTouchOOpOverridden {

    public static void main(String[] args) {

        C obj = new C();
    }
}