package day10.inter.animal;

public abstract class Animal implements Pet, Wild{

    protected int age;

    public abstract void eat();

    public abstract void sleep();
}
