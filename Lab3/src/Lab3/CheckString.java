package Lab3;
import java.util.*;
import java.io.*;
public class CheckString {
	public static void checkOrder(String s) {
		char[] ch=s.toCharArray();
		int l=s.length();
		Arrays.sort(ch);
		String temp=new String(ch);
		if(temp==s)
			System.out.println(temp+"Positive String");
		else
			System.out.println((temp==s)+"not a Positive String");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="a";
		s=s.toUpperCase();
		System.out.println(s);
		checkOrder(s);
		

	}

}
