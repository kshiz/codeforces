//1184A1
import java.util.*;
public class heidiA1{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long r=sc.nextLong();
    if(r%2==0||r<=3)
    System.out.println("NO");
    else{
      System.out.println("1"+" "+((r-3)/2));
    }
  }
}
