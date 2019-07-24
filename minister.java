//1178A
import java.util.*;
public class minister{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      sum=sum+a[i];
    }
    int c=a[0];
    LinkedList<Integer>b=new LinkedList<Integer>();
    b.add(1);
      for(int i=1;i<n;i++){
        if(a[i]<=a[0]/2&&c<=sum/2){
          c=c+a[i];
          b.add(i+1);
        }
      }
      if(c>sum/2){
        System.out.println(b.size());
        int size=b.size();
        for(int i=0;i<size;i++)
        System.out.print(b.pop()+" ");
      }
      else
      System.out.println(0);
  }
}
