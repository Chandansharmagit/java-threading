package naming;

public class setting extends Thread {

    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String[] args) {

        //making the instance of the class settibg
      
        setting newsSetting = new setting();
         
        setting newsSetting2 = new setting();

        //setting the name 
        newsSetting.setName("chandan sharma");

        newsSetting2.setName("deep sharma");

        newsSetting.start();
        newsSetting2.start();

        System.out.println(newsSetting.getName());
        System.out.println(newsSetting2.getName());

        
        
    }
}
