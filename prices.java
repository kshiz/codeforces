//1183B
import java.util.*;
public class prices{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    while(q!=0){
      int n=sc.nextInt();
      int k=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      if((a[0]+k)>=(a[n-1]-k)){
        System.out.println(a[0]+k);
      }
      else{
        System.out.println(-1);
      }
      q--;
    }
  }
}
