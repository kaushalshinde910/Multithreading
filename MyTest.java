package multithread;

class A extends Thread {
    // Palindrome check logic
    public void run() {
        String word = "madam";
        boolean isPalindrome = checkPalindrome(word);
        if (isPalindrome) {
            System.out.println("is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    private boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class B extends Thread {
    // Fibonacci logic
    public void run() {
        int c = 0;
        int a = 0;
        int b = 1;
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

public class MyTest {
    public static void main(String[] args) {
        B bThread = new B();
        A aThread = new A();

        bThread.start();
        aThread.start();
    }
}
