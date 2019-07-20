//1175 A
import java.util.*;
public class hero{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t  = in.nextInt();
		for(int i = 0;i<t;++i){
      long n = in.nextLong();
  		long k = in.nextLong();
  		long res = 0;
  		while(n>=k){
  			res += n - n/k * k;
  			n = n/k*k;
  			res++;
  			n = n/k;
  		}
  		res += n;
  		System.out.println(res);
    }
	}
}
