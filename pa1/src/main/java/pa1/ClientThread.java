package pa1;


public class ClientThread extends Thread{
    
    public int id;
    public static int numJobsCreated = 0;
    public static Object lock = new Object();
    
    public ClientThread(int id){
        this.id = id;
    }

    @Override
    public void run(){
        System.out.println("Client Thread " + id + " ran.");
        createJob();
    }

    public void createJob(){
        synchronized(lock){
            for(int i = 0; i < 3; i++){
                System.out.println("Thread " + id + " is holding the key");
                try {
                    sleep(50);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
