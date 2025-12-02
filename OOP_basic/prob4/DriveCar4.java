package OOP_basic.prob4;

public class DriveCar4 {
    public static void main(String[] args) {
        Car4 c1 = new Car4(2525);
        c1.displayNo();
        // staticメソッドなのでインスタンスの指定が不要
        Car4.displayCount();

        Car4 c2 = new Car4(7777);
        c2.displayNo();
        Car4.displayCount();   
    }
}
