//Threads 
class Charr extends Thread{
    char c;
    Charr(char c){
        this.c = c;
    }
    public void run(){
        try{
        for(int i=0; i<10; i++){
            Thread.sleep(100);
            System.out.println(c);
        }
    }catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }
    }
}
class Thrd{
    public static void main(String[] args){
        Charr t1 = new Charr('a');
        Charr t2 = new Charr('b');
        t1.start();
        t2.start();
    }
}