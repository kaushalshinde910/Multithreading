package multithread;

class Ob {
    synchronized static void display() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class D1 extends Thread {
    Ob ob;

    D1(Ob ob) {
        this.ob = ob;
    }

    public void run() {
        Ob.display();
    }
}

class m extends Thread {
    Ob ob;

    public m(Ob ob) {
        this.ob = ob;
    }

    public void run() {
        Ob.display();
    }
}

public class objsynchroni {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ob ob = new Ob();
        D1 a1 = new D1(ob);
        m b1 = new m(ob);
        a1.setName("A1 thread");
        b1.setName("B1 thread");
        
        // Start the threads
        a1.start();
        b1.start();
    }
}
