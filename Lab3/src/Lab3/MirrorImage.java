package Lab3;
import java.util.*;
import java.lang.*;

public class MirrorImage {
	public void getImg(String str) {
		StringBuffer sbf=new StringBuffer(str);
		System.out.println(sbf+" | "+sbf.reverse());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		System.out.println("reverse of the string is:");
		MirrorImage m=new MirrorImage();
		m.getImg(str);

	}

}
