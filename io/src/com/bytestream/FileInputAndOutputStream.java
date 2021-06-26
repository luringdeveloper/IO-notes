package com.bytestream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputAndOutputStream {

	public static void main(String[] args) {
		
		//InputStream-> FileInput Stream
		
		
//		try(FileInputStream input=new FileInputStream("C:\\Users\\Administrator\\Desktop\\jdk.txt");){
//			int i=0;
//			while((i=input.read())!=-1) {
//				System.out.print((char)i);
//			}
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//OutputStream-> FileOutputStream
		
		try 
		{
			File file=new File("C:\\Users\\Administrator\\Desktop\\File");
			file.mkdir();
//			File filecopy=new File(file, "jdkcopy.txt");
//			filecopy.createNewFile();
			
		
			
				try(FileInputStream input=new FileInputStream("D:\\Movies\\Bhag milkha bhag.mp4");
					FileOutputStream output=new FileOutputStream(file+file.separator+"1.mp4");)
				{
				byte []buffer=new byte[1024];
					int i=0;
					while((i=input.read(buffer))!=-1){
						output.write(buffer, 0, i);
						output.flush();
					}
					
					
				}catch (Exception e) {
					e.printStackTrace();
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
