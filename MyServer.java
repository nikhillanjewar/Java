import java.net.*;
import java.io.*;
public class MyServer{
	public static void main (String[] args){
		try{
			ServerSocket ss = new ServerSocket(8888);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String)dis.readUTF();
			System.out.println(str);
			ss.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
	