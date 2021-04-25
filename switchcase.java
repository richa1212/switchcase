package switchcase;
import java.util.Scanner;
public class switchcase{
  public static void main(String[] args){
  int choice;
  System.out.println("pick one: 1. hey \t 2.hello \t 3.hii \t  ");
  Scanner s = new Scanner(System.in);
  choice = s.nextInt();
  switch (choice){
    case1: System.out.println("you said hey");
    break;
    case2: System.out.println("you said hello");
    break;
    case3: System.out.println("you said hii");
    break;
    default: System.out.println("invalid choice");
    
    }
  }
}
