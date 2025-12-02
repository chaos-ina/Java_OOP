package OOP_basic.prob1;

public class DriveCar1 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.setNo(2525);
        c1.run(60);
        c1.display();
        c1.brake(20);
        c1.display();
        c1.brake();
        c1.display();
    }
}
