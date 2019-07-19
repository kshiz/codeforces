//1194 D
import java.util.*;
public class game {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();

    while(t!=0){
      boolean win=true;
      int n=sc.nextInt();
      int k=sc.nextInt();
      if(k%3==0){
        int a=n%(k+1);
        if(a%3==0&&a!=k){
          win=false;
        }
      }
      else{
        int a=n%3;
        if(a==0){
          win=false;
        }
      }
      System.out.println(win ? "Alice" : "Bob");
      t--;
    }
  }
}
