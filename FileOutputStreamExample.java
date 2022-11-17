import java.io.FileOutputStream;

class FileTest{
	String str = "BOSS_BOSS_BOSS_BOSS_BOSS";
	void Filewrite(){
		byte b[]= str.getBytes();
		try{
			FileOutputStream fos = new FileOutputStream("D:\\Nikhil\\Data.txt");
			fos.write(b);
			fos.flush();
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

public class FileOutputStreamExample{
	public static void main(String args[]){
		FileTest obj = new  FileTest();
		obj.Filewrite();
}
}
		