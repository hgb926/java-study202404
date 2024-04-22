package day10.abs;

import day10.inter.animal.Aggressive;
import day10.inter.animal.Animal;
import day10.inter.animal.Pet;

public class Cat extends Animal implements Pet, Aggressive {


    @Override
    public void eat() {
        System.out.println("고양이는 생선을 먹어요~~");
    }
    @Override
    public void sleep() {
        System.out.println("고양이는 낮잠을 많이 자요~");
    }

    @Override
    public void hunt(day10.inter.animal.Pet pet) {

    }

    @Override
    public void violent() {

    }

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }
}
