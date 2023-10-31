import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Filehand{
    public static void main(String[] args){
        int oddsum = 0,evesum = 0;
        try{
        FileReader fw = new FileReader("C:\\Users\\nidhi\\Documents\\Files\\filename.txt");
        Scanner s = new Scanner(fw);
        while(s.hasNextLine()){
            String li = s.nextLine();
            String[] words = li.split(" ");
            for(String word : words){
                int x = Integer.parseInt(word);
                if(x%2 == 0){
                    evesum += x;
                }else{
                    oddsum += x;
                }
            }
        }
        System.out.println("Odd Sum: " + oddsum);
        System.out.println("Even Sum: " + evesum);
        fw.close();
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}