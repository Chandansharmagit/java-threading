
// //thread by extending the method 

// class threading extends Thread{
//     public void run(){

//         System.out.println("thread is running....");

//     }
//     public static void main(String[] args) {
//        threading newtThreading =  new threading();
//        newtThreading.start();
//     }

// }

public class threading {
    public static void main(String[] args) {
        // making the objects of the classs

        Thread newtThread = new Thread("threads is running...");

        // starting the thread method

        newtThread.start();

        // getting the thread name by invoking the getName() method;

        String str = newtThread.getName();
        System.out.println(str);
    }

}