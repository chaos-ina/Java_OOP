package OOP_basic.prob3;

public class DriveCar3 {
    public static void main(String[] args) {
        Car3 c1 = new Car3(2525);
        // アクセス修飾子がprivateのためエラーになる
        // c1.speed = 60;

        c1.run(60);
        c1.display();
    }
}
