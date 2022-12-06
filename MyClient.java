import java.net.*;
import java.io.*;
public class MyClient{
	public static void main (String[] args){
		try{
			Socket s = new Socket("localhost", 8888);

			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Nikhil");
			dout.flush();
			dout.close();
			s.close();
	
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
	