package pa1;

public class Main {
    public static void main(String[] args) {
        int numClients = Integer.parseInt(args[0]);
        int numServers = Integer.parseInt(args[1]);
        int jobSlots = Integer.parseInt(args[2]);
        int jobsTotal = Integer.parseInt(args[3]);
        int jobTime = Integer.parseInt(args[4]);
        //thing(numClients, numServers, jobSlots, jobsTotal, jobTime);

        for(int i = 0; i < numClients; i++){
            ClientThread clientThread = new ClientThread(i);
            clientThread.start();
        }

        // for(int i = 0; i < numServers; i++){
        //     ServerThread serverThread = new ServerThread(i);
        //     serverThread.start();
        // }
    }
    
    public static void thing(int numClients, int numServers, int jobSlots, int jobsTotal, int jobTime){
        System.out.println("Num Clients: " + numClients);
        System.out.println("Num Servers: " + numServers);
        System.out.println("Num Job Slots: " + jobSlots);
        System.out.println("Num Jobs Total: " + jobsTotal);
        System.out.println("Job Time: " + jobTime);
    }
}

