//1197A
import java.util.*;
public class ladder{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t = sc.nextInt();
    while(t!=0){
      int n=sc.nextInt();
      Integer a[]=new Integer[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      //int b[]=new int[2];
      /*b[0]=a[n-2];
      b[1]=a[n-1];
      int count=0;
      for(int i=0;i<n-2;i++){
        if(a[i]<b[0]&&a[i]<b[1])
        count++;
      }*/
      System.out.println(Math.min(Math.min(a[n-1], a[n-2])-1, n-2));
      t--;
    }
  }
}
