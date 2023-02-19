package strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
