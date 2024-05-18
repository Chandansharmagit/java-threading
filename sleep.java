public class sleep extends Thread {
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i = 0;i<=3;i++){
            System.out.println(n);
            try {
                 Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
         
        }
    }
    public static void main(String[] args) {
        sleep newSleep = new sleep();

        sleep newsleeping = new sleep();

        newsleeping.setName("sharma second");
        newSleep.setName("first");

        newsleeping.start();

        newSleep.start();

    }
    
}
