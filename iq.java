import java.util.*;
public class iq{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int e=0,o=0;
    int le=0,lo=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      if(a[i]%2==0){
        e=e+1;
        le=i;
      }
      else{
        o=o+1;
        lo=i;
      }
    }
    if(o==1){
      System.out.println(lo+1);
    }
    else{
      System.out.println(le+1);
    }
  }
}
