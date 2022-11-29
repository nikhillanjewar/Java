import java.util.linkedlist;
import.java.util.Scanner;
import.java.util.Collection.sort;

public class Demolinkedlist{
	public static void main (String[] args){
			linkedlist<string>Developers = new Linkedlist,string>();
			Parts.add("Screw");
			Parts.add("Nut");
			Parts.add("Headlights");
			Parts.add("Bumper");
			Parts.add("Flim");
			Parts.add("Meter");

			System.out.println("\n Original List of the Spare Parts: \n");
			System.out.println(Parts);

			System.out.println("\n Sorted List of the Spare Parts: \n");
			Collection.sort(Parts);
			System.out.println(Parts);

			Scanner Myobj = new Scanner(System.in);
			System.out.println("\n Enter the Parts number to be searched\n");
			int Parts = Myobj.nextInt();
			for(int i=0; i<=(Parts.size)-1; i++);
				if(Parts == Parts.get(i)){
					flag = 1;
					break;
				}else{
					continue;
				}
			}
			if (flag ==1)
			System.out.println(''\n Spare Parts is available in the Linkedlist");
			else
			System.out.println("\n Spare Parts is Not availabale in the Linkedlist");
		}
}