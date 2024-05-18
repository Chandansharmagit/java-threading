package multi;



public class chandan implements Runnable {

    //making the variable passanger and available
    int available = 1,passenger;

    //making the constructor in the chandan class
    chandan(int passenger){
        this.passenger = passenger;
    }

    //making the run method to run the thrrad and runnable method
    //making the syncronized method

    public synchronized void run(){

        try {

            String name = Thread.currentThread().getName();

            if(available >= passenger){
                System.out.println(name + " reversed  seat ");

                available = available - passenger;

            }else{

                System.out.println("sorry seat has been already registered...");
            }
            
        } catch (Exception e) {
           System.out.println(e);
        }

    }


    public static void main(String[] args) {

        //passing the constructor value to the main class chandan

        chandan newChandan = new chandan(1);

        //making the thread class and settting the newchandan into it

        Thread nethThread = new Thread(newChandan);

        Thread newmantThread = new Thread(newChandan);

        Thread newsThread = new Thread(newChandan);

        //setting the priority in the thread

        newsThread.setPriority(7);

        newmantThread.setPriority(3);
        newsThread.setPriority(5);

        //setting the name and passing it to the 

        newsThread.setName("chandan sharma");
        newmantThread.setName("deepika sharma");
        nethThread.setName("deepika dhakal");


        //starting the thread from its rest opertion

        nethThread.start();
        newmantThread.start();
        newsThread.start();
        
    }
}
