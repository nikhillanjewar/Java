public class  Marksheet{
	public static void main (String[]args){

		String name="Nikhil";
		String dept="ETC";
		int Year=3;
		char sec='B';

		int java=88;
		int python=76;
		int HTML=89;
		int SS=88;
		int SQL=75;

		int total_marks=java+python+HTML+SS+SQL;
		float percentage=(total_marks/5);

				

		if (percentage>=75)
			System.out.print("Grade=A+");

		else if (percentage>=65 && percentage<=75)
			System.out.print("Grade=A");

		else if (percentage<=50 && percentage<=60)
			System.out.print("Grade=B");

		else if (percentage>=40 && percentage<=50)
			System.out.print("Grade=C");

		else if (percentage<40)
			System.out.print("Grade=F");

		else 
			System.out.print("Inavlid");



		System.out.print("\nName of the student: " +name);
		System.out.print("\nDepartment of the student: " +dept);
		System.out.print("\nYear of the student: " +Year);
		System.out.print("\nSection of the student: " +sec);
		System.out.print("\n\nMarks obtained in 5 subjects\n\n");
		System.out.print("\nJAVA: " +java);
		System.out.print("\nPython: " +python);
		System.out.print("\nSS: " +SS);
		System.out.print("\nHTML: " +HTML);
		System.out.print("\nSQL: " +SQL);

		System.out.print("\nTotal marks: " +total_marks);
		System.out.print("\nPercentage: " +percentage);
		//System.out.print("Grade" +Grade);


		



}


}
