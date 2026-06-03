package com.sb.SpringBootMay2026.hashcodequalsTut;

import java.util.HashSet;
import java.util.Objects;

class Artisan {

    int id;
    String name;

    Artisan(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Artisan artisan)) {
            return false;
        }
        return id == artisan.id && Objects.equals(name, artisan.name);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Artisan artisan = (Artisan) o;
//        return id == artisan.id && Objects.equals(name, artisan.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Artisan{id=" + id + ", name='" + name + "'}";
    }

}

class Main {

    public static void main(String[] args) {

        HashSet<Artisan> set = new HashSet<>();

        set.add(new Artisan(101, "Sai"));
        set.add(new Artisan(101, "Sai")); // duplicate
        set.add(new Artisan(102, "Kumar"));

        System.out.println(set);


    }
}