public interface FlyBehavior {
    public void fly();
}

public interface QuackBehavior {
    public void quack();
}

public FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}

public FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }
}

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack()
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}