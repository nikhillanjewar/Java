public class Temprature {
	public static void main (String[]args){

		int temp=75;

		if(temp==-273)
			System.out.print("\nTemperature at absolute zero");

		else if(temp>-273 && temp<0)
			System.out.print("\nTemperature is below freezing point");


		else if(temp>0)
			System.out.print("\nTemperature is in normal range");


		else if(temp>0 && temp<100)
			System.out.print("\nTemperature is in normal range");


		else if(temp==100)
			System.out.print("\nTemperature is at boiling point");



		else if(temp>100)
			System.out.print("\nTemperature is above boiling point");
	
	

		else
			System.out.print("temp is invalid");











}




}