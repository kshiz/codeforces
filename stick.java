//610A
import java.util.*;
public class stick{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=1;
    int b=(n/2)-1;
    int count=0;
    while(a<b){
      if(a!=b&&((a+b)*2)==n){
        count+=1;
      }
      a+=1;
      b-=1;
    }
    System.out.println(count);
  }
}
