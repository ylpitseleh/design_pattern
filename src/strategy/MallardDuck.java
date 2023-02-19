package strategy;

public class MallardDuck extends Duck {

    MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    void display() {
        System.out.println("저는 물오리입니다.");
    }

}
