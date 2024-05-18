public class following implements Runnable {
    public void run(){
        System.out.println("now the thread is running...");
    }

    //making the main method
    public static void main(String[] args) {
        //creeating the objects of the class following
        Runnable newrRunnable = new following();

        //creating the objects of the class thread

        Thread newthThread = new Thread(newrRunnable,"the threads is running");
        //makin the start the of the thread 
        newthThread.start();

        //gettting the name of the newthread
        String newsString = newthThread.getName();
        System.out.println(newsString);

        
    }
    
}
