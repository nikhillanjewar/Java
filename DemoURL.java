import java.net.*;
public class DemoURL{
	public static void main(String[] args){
		try{
			URL url = new URL("https://sbjit.edu.in/placements/search? q= SDLC Cycle");
			System.out.println("Protocol\t:" +url.getProtocol());
			System.out.println("Host\t:" +url.getHost());
			System.out.println("File\t:" +url.getFile());
			System.out.println("Port\t:" +url.getPort());
			System.out.println("Default Port\t:" +url.getDefaultPort());
			System.out.println("Query\t:" +url.getQuery());
			System.out.println("Path\t:" +url.getPath());
		}catch(Exception e){	
			System.out.println(e);
		}
	}
}