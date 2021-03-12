package Lab3;
import java.util.*;
public class ModifyNum {
	public void modifyNum(int n) {
		String s=String.valueOf(n);
		StringBuffer temp=new StringBuffer();
		int l=s.length();
		for(int i=0;i<l-1;i++) {
			int a= Integer.parseInt(String.valueOf(s.charAt(i)));		
			int b=Integer.parseInt(String.valueOf(s.charAt(i+1)));	
			int c=Math.abs(a-b);
			temp.append( c);
		}
		int last=Integer.parseInt(String.valueOf(s.charAt(l-1)));	;
		System.out.println(temp+""+last);
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
