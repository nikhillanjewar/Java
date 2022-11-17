import java.io.FileInputStream;
class FileTest{
	void FileRead(){
		try{
			FileInputStream fis = new  FileInputStream("D:\\Nikhil\\data.txt");
			int i;
			while((i=fis.read())!=-1){
				System.out.print((char)i);
			}
		    }catch(Exception e){
			e.printStackTrace();
			}
}
}
public class FileInputStreamExample{
	public static void main(String[] args){
		FileTest obj = new FileTest();
		obj.FileRead();
	}
}

		