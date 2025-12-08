package OOP_advanced.prob2;

class Taxi2 extends Car2{
    private int price;

    public Taxi2(int no)
    {
        super(no);
        this.price = 0;
    }

    public Taxi2(int no, int price)
    {
        super(no);
        this.price = price;
    }

    public void start()
    {
        this.price = 420;
    }

    public void run()
    {
        this.price += 80;
    }

    public void display()
    {
        super.display();
        System.out.println("price = " + this.price);
    }
}