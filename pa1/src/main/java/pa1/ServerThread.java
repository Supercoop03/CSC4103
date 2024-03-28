package pa1;

public class ServerThread extends Thread{
    
    public int id;

    public ServerThread(int id){
        this.id = id;
    }

    @Override
    public void run(){
        System.out.println("Server Thread " + id + " ran.");
    }
}
