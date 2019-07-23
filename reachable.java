//1157A
import java.util.*;
public class reachable{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=9;
    //numbers 1-9 are always in result so included before hand
    while(n>9){
      n=n+1;
      while(n%10==0){
        n=n/10;

      }
      c++;
    }
    System.out.println(c);
  }
}
