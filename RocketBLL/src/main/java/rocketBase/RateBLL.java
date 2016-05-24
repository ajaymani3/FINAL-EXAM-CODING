package rocketBase;
import java.util.ArrayList;
import org.apache.poi.ss.formula.functions.*;
import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) 
	{
		//TODO - RocketBLL RateBLL.getRate - make sure you throw any exception
		
		//		Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
		
		
		//TODO - RocketBLL RateBLL.getRate
		//			obviously this should be changed to return the determined rate
		
		ArrayList<RateDomainModel> Rates = RateDAL.getAllRates();
		if (GivenCreditScore >= Rate.getiMinCreditScore){
			return Rates = Rate.getdInterestRate();
		}
		
	}
	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	//   r = rate
	//   n = number of periods
	//   p = payment per period
	//   t = type
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		double InterestRate
		int Term
		double value
		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
