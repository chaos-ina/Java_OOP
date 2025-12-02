package OOP_basic.prob2;

public class Car2 {
    int no;
    int speed;

    Car2() {
        no = 0;
        speed = 0;
    }

    Car2(int n) {
        no = n;
    }

    void setNo(int n) {
        no = n;
    }

    void run(int s) {
        speed = s;
    }

    // オーバーロード
    void brake() {
        speed = 0;
    }

    void brake(int s) {
        speed -= s;
    }

    void display() {
        System.out.println("no = " + no);
        System.out.println("speed = " + speed);
    }
}
