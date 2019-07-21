//1140A
import java.util.*;

public class detective {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+1];
		int b=0,c=0;
		for(int i=1;i<=n;i++){
		    a[i]=sc.nextInt();
		    b=(a[i]>b)?a[i]:b;
		    if(i==b)
		    c++;

		}
		System.out.println(c);

	}
}
