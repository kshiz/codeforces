//1170 A 
import java.util.*;
public class three{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0){
      int x=sc.nextInt();
      int y=sc.nextInt();
      int a=((int)Math.min(x,y))-1;
      int b=x-a;
      int c=y-a;
      System.out.println(a+" "+b+" "+c);
      t--;
    }
  }
}
