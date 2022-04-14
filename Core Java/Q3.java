//Fetchdata thread
class FetchData extends Thread{

    @Override
    public void run(){
        try{
            //sleeping for 5 seconds
            Thread.sleep(5000);
            System.out.println("Hello from Thread 1");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}


//Processdata thread
class ProcessData implements Runnable{

    @Override
    public void run(){
        try{
            // sleeping for 10 secs
            Thread.sleep(10000);
            System.out.println("Hello from Thread 2");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

class Question3 {
    public static void main(String args[]) throws InterruptedException{
        FetchData f = new FetchData();
        ProcessData p = new ProcessData();
        Thread thread = new Thread(p);  
        f.start();
        f.join();
        thread.start();     
    }
}