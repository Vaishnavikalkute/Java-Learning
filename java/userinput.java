import java.util.Scanner;

public class userinput {
    public static String display(String val,int val2){
        return String.format("%s i love you more than  %d%% all people in this world",val,val2);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter the name");
        String name=scanner.nextLine();
        System.out.println("Enter the value");
        int val=scanner.nextInt();

        // Close the scanner
        scanner.close();

        String show=display(name,val);
        System.out.println(show);

    }
}
