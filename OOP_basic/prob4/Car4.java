package OOP_basic.prob4;

public class Car4 {
    private int no;
    static private int count;

    public Car4() {
        no = 0;
        count++;
    }

    public Car4(int n) {
        no = n;
        count++;
    }

    public static void displayCount() {
        System.out.println("count = " + count);
    }

    public void displayNo() {
        System.out.println("no = " + no);
    }
}
