package day10.inter.animal;

// interface 는 여러개 implements 가능. (상속은 불가능했던 문제)
public class BullDog implements Pet, Aggressive {
    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void hunt(Pet pet) {

    }

    @Override
    public void violent() {

    }

    // 사냥 기능

    // 난폭함

    // 애완동물로 키울 수 있음
}
