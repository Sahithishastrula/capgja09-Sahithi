package Lab3;
import java.text.*;
import java.util.*;
import java.time.*;

public class DifferenceInDates {
	public static void difference(LocalDate s,LocalDate e) {
		Period diff=Period.between(s, e);
		System.out.println("Difference in dates:");
		System.out.println(diff.getDays()+"days"+diff.getMonths()+"months"+diff.getYears()+"years");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		String sDate1=sc.nextLine();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy,mm,dd");
		Date d=sd.format(sDate1);*/
		LocalDate start_date =LocalDate.of(2018, 01, 10); 
		LocalDate end_date = LocalDate.now(); 
		difference(start_date, end_date); 
	}

}
