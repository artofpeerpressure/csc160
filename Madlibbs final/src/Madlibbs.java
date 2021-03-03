import java.util.Scanner;

public class Madlibbs {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            String noun;
            String adj;
            String verb;
            String noun2;
            String adj2;
            String verb2;
            String noun3;
            String adj3;
            String verb3;
            String noun4;
            String adj4;
            String verb4;
            String noun5;
            String adj5;
            String verb5;
            // Enter username and press Enter
            System.out.println("Enter Noun");
            noun = myObj.nextLine();
            System.out.println("Enter Adjective");
            adj = myObj.nextLine();
            System.out.println("Enter Verb");
            verb = myObj.nextLine();
            System.out.println("Enter Noun");
            noun2 = myObj.nextLine();
            System.out.println("Enter Adjective");
            adj2 = myObj.nextLine();
            System.out.println("Enter Verb");
            verb2 = myObj.nextLine();
            System.out.println("Enter Noun");
            noun3 = myObj.nextLine();
            System.out.println("Enter Adjective");
            adj3 = myObj.nextLine();
            System.out.println("Enter Verb");
            verb3 = myObj.nextLine();
            System.out.println("Enter Noun");
            noun4 = myObj.nextLine();
            System.out.println("Enter Adjective");
            adj4 = myObj.nextLine();
            System.out.println("Enter Verb");
            verb4 = myObj.nextLine();
            System.out.println("Enter Noun");
            noun5 = myObj.nextLine();
            System.out.println("Enter Adjective");
            adj5 = myObj.nextLine();
            System.out.println("Enter Verb");
            verb5 = myObj.nextLine();

            System.out.println("You are a "+adj+" "+noun+"who "+verb+". You meet a "+adj2+" "+noun2+" who hurts "+adj3+" "+noun3+" by "+verb3+""+verb4+""+verb5+""+adj4+"" +adj5+""+noun4+""+noun5+" ");
        }

}
