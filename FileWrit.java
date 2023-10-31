import java.io.FileWriter;
import java.util.Scanner;
class FileWrit{
    public static void main(String[] args){
        try{
            FileWriter writee = new FileWriter("C:\\Users\\nidhi\\Documents\\Files\\wrtieFile.txt");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter The Input For The File: ");
            String x = scan.nextLine();
            writee.write(x);
            writee.close();
            System.out.println("Successfully printed to the file");
        }catch(Exception e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}