import java.util.*;
public class shape{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%2==0){
      System.out.println((int)Math.pow(2,n/2));
    }
    else{
      System.out.println(0);
    }
  }
}
