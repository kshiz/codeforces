//1154C
import java.util.*;
public class gourmet{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[3];
    for(int i=0;i<3;i++){
      a[i]=sc.nextInt();
    }
    int f=(int)Math.min(a[0]/3,Math.min(a[1]/3,a[2]/3));
    a[0]-=f*3;
    a[1]-=f*2;
    a[2]-=f*2;
    int res=0;
    int i[]={0,1,2,0,2,1,0};
    int t[]=new int [3];
    for(int s=0;s<7;s++){
      int day=s;
      t[0]=a[0];
      t[1]=a[1];
      t[2]=a[2];
      int cur=0;
      while (t[i[day]] > 0) {
			     --t[i[day]];
			     day = (day + 1) % 7;
			     ++cur;
		}
		res =(int)Math.max(res, f * 7 + cur);
    }
    System.out.println(res);
  }
}
