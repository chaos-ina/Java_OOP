package OOP_basic.prob1;

public class Car1 {
    int no;
    int speed;

    void setNo(int n)
    {
        no = n;
    }

    void run(int s)
    {
        speed = s;
    }

    // オーバーロード
    void brake()
    {
        speed = 0;
    }

    void brake(int s)
    {
        speed -= s;
    }

    void display()
    {
        System.out.println("no = " + no);
        System.out.println("speed = " + speed);
    }
}
