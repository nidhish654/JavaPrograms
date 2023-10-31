import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileReadd{
    public static void main(String[] args){
        int oddsum = 0,evesum = 0;
        try{
        FileReader fw = new FileReader("C:\\Users\\nidhi\\Documents\\Files\\readFile.txt");
        Scanner s = new Scanner(fw);
        while(s.hasNextLine()){
            String li = s.nextLine();
            //String[] words = li.split(" ");
            System.out.println(li);
            }
        fw.close();
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}