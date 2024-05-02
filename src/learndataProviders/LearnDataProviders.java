package learndataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviders {

	
	@Test(dataProvider="getData")
	public void mytest(String firstName , String lastName) {
		System.out.println("I am executing");
		System.out.println(firstName +" : "+lastName);
		
	}

	@Test(dataProvider="getData2")
	public void mytest(Integer firstVal , Integer secondVal) {
		System.out.println("I am executing");
		System.out.println(firstVal +" : "+ secondVal);
		
	}
	

	@DataProvider
	public Integer[][] getData2() {
		Integer[][] data = new Integer[2][2];
		data[0][0]= 132;
		data[0][1]= 11;
		
		data[1][0]= 78;
		data[1][1]= 89;
	
		return data;
		
	}
	
	@DataProvider
	public String[][] getData() {
		String[][] data = new String[3][2];
		data[0][0]= "Mandy";
		data[0][1]= "Singh";
		
		data[1][0]= "Vineetha";
		data[1][1]= "Varghese";
		
		data[2][0]="Nitheesha";
		data[2][1]="Gopal";
		return data;
		
	}
}
