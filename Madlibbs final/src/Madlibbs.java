import java.util.Scanner;

public class Madlibbs {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            String noun;
            String adj;

            // Enter username and press Enter
            System.out.println("Enter Noun");
            noun = myObj.nextLine();
            System.out.println("Enter Adjective");
            adj = myObj.nextLine();


            System.out.println("You are a "+adj+" "+noun);
        }

}
