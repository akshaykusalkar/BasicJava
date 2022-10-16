package basicjava;

public class TotalYearDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int  days, years, months, weeks;
	  	
		days = 1050;

		years = days / 365;
  		days = days % 365;
  		months = days / 30;
		days = days % 30;
		weeks = days / 7;
		days = days % 7;
  	
		System.out.println("\n Years  = " + years );
  		System.out.println("\n Months=" + months );
	  	System.out.println ("\n Weeks = " + weeks );
		System.out.print( "\n Days   = " + days );
	}

}
