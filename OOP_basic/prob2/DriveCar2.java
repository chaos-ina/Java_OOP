package OOP_basic.prob2;

public class DriveCar2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.setNo(2525);
        c1.run(60);
        c1.display();
        c1.brake();
        c1.display();

        Car2 c2 = new Car2(7777);
        c2.run(60);
        c2.display();
        c2.brake();
        c2.display();
    }
}
