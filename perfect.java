//233A
import java.util.*;
public class perfect{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%2!=0)
    System.out.println(-1);
    else{
      while(n>0){
        System.out.print(n+" ");
        n-=1;
      }
    }
  }
}
