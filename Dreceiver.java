import java.net.*;
public class Dreceiver{
	public class static void main(String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket[3000];
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		ds.receive(dp);
		string str = new string(dp.getdata(), 0, dp.getlength());
		System.out.println(str);
		ds.close();
}
}