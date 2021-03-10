package Lab3;
import java.util.*;

public class AlterString {
	public static boolean isVowel(char ch) {
		if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
			return false;
		}
		else {
			return true;
		}
	}
	public static void alterString(char[] s) {
		  for (int i = 0; i < s.length; i++) 
	        { 
	            if (!isVowel(s[i])) 
	            { 
	  
	                if (s[i] == 'z')  
	                { 
	                    s[i] = 'b'; 
	                } 
	                else
	                { 
	  
	                     
	                    s[i] = (char) (s[i] + 1); 
	  
	                    
	                    if (isVowel(s[i]))  
	                    { 
	                        s[i] = (char) (s[i] + 1); 
	                    } 
	                } 
	            } 
	        }
		  String res=" ";
	      for(int i=0;i<s.length;i++)
	        	res=res+s[i];
		System.out.println("Modifies String is:"+res);
	    } 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toUpperCase();
		char[] ch=str.toCharArray();
		alterString(ch);
		

	}

}
