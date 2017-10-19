package Task8.Thread.exp;

public class TestRunnable implements Runnable {

    private String name;

    public TestRunnable(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for(int i = 0;i<5;i++) {
            System.out.println(name + " run : " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
