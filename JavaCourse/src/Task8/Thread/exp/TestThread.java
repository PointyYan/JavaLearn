package Task8.Thread.exp;

public class TestThread extends Thread {
    private  String name;

    public TestThread(String name) {
        this.name = name;

    }

    @Override
    public void run() {
        for (int i = 0 ; i < 30 ; i++) {
            System.out.println(name + " run: " + i);
            try{
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

