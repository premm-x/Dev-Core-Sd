interface Worker {
    void work();
    void eat();
    void sleep();
}

class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human is working.");
    }
    public void eat() {
        System.out.println("Human is eating.");
    }
    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot is working.");
    }
    public void eat() {
        // not applicable
        throw new UnsupportedOperationException("Robot doesn't eat");
    }
    public void sleep() {
        // not applicable
        throw new UnsupportedOperationException("Robot doesn't sleep");
    }
}

public class Before {
    public static void main(String[] args) {
        Worker robot = new RobotWorker();
        robot.work();
        robot.eat(); // causes runtime error
    }
}
