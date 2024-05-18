public class run_method extends Thread {

    public void run() {
        for (int i = 0; i <= 5; i++) {

            try {
                System.out.println("thread running");
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static void main(String[] args) {

        run_method newrRun_method = new run_method();

        newrRun_method.start();

        for (int i = 0; i <= 4; i++) {
            System.out.println("chandan sharma");
        }

    }
}
