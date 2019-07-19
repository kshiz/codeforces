//1111 B failed on case 15
import java.util.*;
public class superhero{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int m=sc.nextInt();
    int a[]=new int[n];
    int sum=0;
    double max=0.0;
    double tp=0.0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      sum+=a[i];
    }
    Arrays.sort(a);
  		for(int i=0;i<n&&i<=m;i++) {
  			double mx = (sum + Math.min((n-i)*k, m-i))/(double)(n-i);
  			if(mx>max) {
  				max = mx;
  			}
  			sum-=a[i];
  		}
    System.out.printf("%.20f", max);
  }
}
