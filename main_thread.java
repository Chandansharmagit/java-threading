
// import java.lang.Thread;

public class main_thread extends Thread {
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        try {
            main_thread newtThread = new main_thread();
            newtThread.start();
            newtThread.start();
        } catch (Exception e) {
           System.out.println("the thread cannot be run for multiple steps or times");
        }
    }
}
