import java.net.*;
public class Dsender{
	public static void main (String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket();
		String str = "Welcome to Central Lab";
		InetAddress ip = InetAddress.getByName("loclahost");
		DatagramPacket dp = new DatagramPacket(str.getbytes(), str.length(), ip, 3000);
		ds.send(dp);
		ds.close();
		}
}