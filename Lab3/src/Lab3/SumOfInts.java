package Lab3;
import java.util.*; 
import java.io.*;

public class SumOfInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		String[] s=str.split(" ");
		int summ=0;
		System.out.println("integers are:");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			try {
                summ=summ+ Integer.parseInt(s[i]);
            } catch (NumberFormatException e) {
                s[i]="";
            }
			
		}
		System.out.println("sum is:"+summ);

	}

}
