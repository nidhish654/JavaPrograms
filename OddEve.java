import java.util.Scanner;
class Even extends Thread {
    int[] earr = new int[100];
    int n;
    Even(int[] ar, int num){
        n = num;
        for(int i=0; i<num; i++){
            earr[i] = ar[i];
        }
    }
    public void run(){
        for(int i=0; i<n; i++){
            if(earr[i]%2 == 0){
            System.out.println("Even : " + earr[i]);
            }
        }
    }
}
class Odd extends Thread {
    int[] oarr = new int[100];
    int n;
    Odd(int[] ar, int num){
        n = num;
        for(int i=0; i<num; i++){
            oarr[i] = ar[i];
        }
    }
    public void run(){
        for(int i=0; i<n; i++){
            if(oarr[i]%2 != 0){
            System.out.println("Odd : " + oarr[i]);
            }
        }
    }
}
public class OddEve {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter The Range of The Array (1-100)");
        int num = inp.nextInt();
        inp.nextLine();
        int[] arr = new int[num];
        System.out.println("Enter The Numbers :");
        for(int i=0; i<num; i++){
            arr[i] = inp.nextInt();
            inp.nextLine();
        }
        Even ev = new Even(arr,num);
        Odd od = new Odd(arr,num);
        ev.start();
        od.start();
        inp.close();
    }
}