import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //get input
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Description");
        String d=input.nextLine();
        System.out.println("Enter Description");
        int f=input.nextInt();

        //call item method
        Item s1=new Item (f,d);
        int a=s1.getLocation();
        String b=s1.getDescription();
        System.out.println("location is:"+a);
        System.out.println(b);
    }
}