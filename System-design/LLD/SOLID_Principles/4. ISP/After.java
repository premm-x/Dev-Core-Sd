interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class HumanWorker implements Workable, Eatable, Sleepable {
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

class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot is working.");
    }
}

public class After {
    public static void main(String[] args) {
        Workable robot = new RobotWorker();
        robot.work(); // no unnecessary methods
    }
}
