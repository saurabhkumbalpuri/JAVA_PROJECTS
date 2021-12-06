   import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Enter the stage event start date and end date");
			try {
			SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
			Date date1,date2;
			String a = sc.next();
			date1 = dateFormate.parse(a);
			String b = sc.next();
			date2 = dateFormate.parse(b);
			System.out.println("Start date:" +dateFormate.format(date1));
			System.out.println("End date:" +dateFormate.format(date2));
		} catch (ParseException e) {
			System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
		}

	}

}