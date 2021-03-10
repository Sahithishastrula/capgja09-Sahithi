package Lab3;
import java.util.*;
public class ModifyNum {
	public void modifyNum(int n) {
		String s=String.valueOf(n);
		StringBuffer temp=new StringBuffer();
		int l=s.length();
		for(int i=1;i<l-1;i++) {
			int a= s.charAt(i-1);
			int b=s.charAt(i);
			int c=Math.abs(a-b);
			temp.append( c);
			System.out.println(a+""+b+""+c);
		}
		int last=s.charAt(l-1);
		temp.append(last);
		System.out.println(l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ModifyNum m=new ModifyNum();
		System.out.println("enter input value:");
		int n=sc.nextInt();
		System.out.println("Modified number is:");
		m.modifyNum(n);
	}

}
