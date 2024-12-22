package hello;
import java.util.Scanner;
public class switchcase {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Value(1,2,3):");
int i=sc.nextInt();
switch(i){
case 1:
	System.out.println("Hii");
	break;
case 2:
	System.out.println("Hello");
	break;
case 3:
	System.out.println("Bye👋");
default:
	System.out.println("Invalid input");
}
}
}
