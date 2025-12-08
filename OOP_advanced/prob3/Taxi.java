package OOP_advanced.prob3;

class Taxi extends Car{
    Taxi()
    {
        this(9999);
        System.out.println("Taxi()");
    }

    Taxi(int no)
    {
        super(no);
        System.out.println("Taxi(int no)");
    }

    Taxi(String no)
    {
        /* 
            子クラスのコンストラクタの最初にsupert(), this()どちらもない場合は、
            暗黙的に親クラスのコンストラクタを呼び出される
            子クラスのコンストラクタの最初の行は？
            │
            ├─ super(...) がある？
            │   └─ YES → そのsuper(...)が実行される
            │             （super()は自動挿入されない）
            │
            ├─ this(...) がある？
            │   └─ YES → そのthis(...)が実行される
            │             （super()は自動挿入されない）
            │             （ただし、呼び出された先のコンストラクタで
            │               最終的にはsuper系が呼ばれる）
            │
            └─ どちらもない？
                └─ YES → 自動的に super(); が挿入される
                        （親クラスの引数なしコンストラクタが呼ばれる）
        */
        System.out.println("Taxi(String no)");
    }
}