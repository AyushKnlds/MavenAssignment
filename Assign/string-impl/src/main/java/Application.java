import java.util.Scanner;

public class Application {

    public static void main(String[] args)
    {
        System.out.println("Enter a string :");
        int cont=1;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //StringFunctions sf = new StringFunctions();
        do{
            System.out.println("\nEnter 1 for Reverse of String\nEnter 2 for Length of String\nEnter 0 for Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:System.out.print("Reverse of string : ");  //For reverse of string//
                    StringFunctions.reverseString(str);
                    break;
                case 2:System.out.print("Length of string : ");  //For length of string//
                    StringFunctions.lengthOfString(str);
                    break;
                case 0:cont = 0;
                    break;
                default:
                    System.out.println("Wrong choice entered:");   //If the user enter incorrect choice//

            }
        }while(cont == 1);

    }

}
