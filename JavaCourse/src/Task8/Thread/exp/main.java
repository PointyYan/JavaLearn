package Task8.Thread.exp;

public class main{
    public static void main(String[] args) {
        TestThread tT1 = new TestThread("A");
        TestThread tT2 = new TestThread("B");
        tT1.start();
        tT2.start();

        new Thread(new TestRunnable("C")).start();
        new Thread(new TestRunnable("D")).start();
    }
}
