import java.util.HashMap;
public class DemoHashMap{
	Public static void main(String[] args){
		HashMap<String, String> capitalcities = new HashMap<String, String>();
		capitalcities.put("India","Delhi");
		capitalcities.put("Jaipur","Rajasthan");
		capitalcities.put("Indore","MP");
		capitalcities.put("Mumbai","Maharashtra");

		System.out.println("\n Original Map\n");
		System.out.println(capitalcities):
		
		System.out.println("\n Printing the key\n");
		for(String i : capitalcities.keyset(){
			System.out.println(i);
		}
		System.out.println("\n Printing the values\n");
		for(String i : capitalcities.values(){
			System.out.println(i);
		}
		
		System.out.println("\n Printing the keys and thier Values\n");
		System.out.println('keys\t\tvalues");
		for(String i : capitalcities.keyset()){
			System.out.println(i + "\t\t' +capitalcities.get(i));
		}
	}
}