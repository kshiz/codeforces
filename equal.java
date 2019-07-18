//1154 B
import java.util.*;
public class make{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int[] b = Arrays.stream(a).distinct().sorted().toArray();
	if (b.length == 1) {
		System.out.println(0);
	} 
	else if (b.length == 2) {
		int diff = b[1] - b[0];
		System.out.println((diff % 2 == 0) ? (diff / 2) : diff);	
	} 
	else if (b.length == 3) {
		int diff0 = b[1] - b[0];
		int diff1 = b[2] - b[1];

		if (diff0 == diff1) {
			System.out.println(diff0);
		}
		else{System.out.println(-1);}
	}
	else{System.out.println(-1);}
  }
}

