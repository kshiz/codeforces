import java.util.*;
public class Alex{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(rohmbus(n));
  }
  static int rohmbus(int n){
    if(n==1)
    return 1;
    else
    return (int)Math.pow(2,n)+rohmbus(n-1);
  }
}
