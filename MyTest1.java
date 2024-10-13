package multithread;

class Fibbo extends Thread {
    int a = 0;
    int b = 1;
    int c = 0;

    public void run() {
        System.out.println("Fibonacci numbers:");
        System.out.println(a);
        System.out.println(b);
        int cnt = 10;

        while (cnt > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            cnt--;
        }
    }
}

class Table extends Thread {
    int num = 5;

    public void run() {
        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}

class Prime extends Thread {
    int num = 7;

    public void run() {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }
        if (cnt == 2) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}

public class MyTest1 {

    public static void main(String[] args) {
        Fibbo a = new Fibbo();
        Table b = new Table();
        Prime c = new Prime();

        a.start();
        b.start();
        c.start();
    }
}
