package multi;

class sharma extends Thread{
    public void run() {

        try {

            for (int i = 0; i <= 50; i++) {
                System.out.println("hello..");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

public class hii extends Thread {

    public void run() {

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("hii..");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // making the another class

    public static void main(String[] args) {

        // making the objects of the class

        hii newhHii = new hii();

        sharma newhSharma = new sharma();

        newhSharma.start();

        newhHii.start();

    }
}
