public class makingthethread extends Thread {

    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String[] args) {

        //makig the instance of the clas
        makingthethread newhMakingthethread = new makingthethread();

        newhMakingthethread.start();
        
    }
}
