package com.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		
		//ByteArrayInputStream
		
//		String msg="Ajay is a Good Boy";
//		byte []a=msg.getBytes();
//		
//		ByteArrayInputStream bais=new ByteArrayInputStream(a);
//		
//		int i=0;
//		while((i=bais.read())!=-1) {
//			System.out.print((char)i);
//		}
		System.out.println("hello");
		//ByteArrayOutputStream
		String a=String.valueOf(new FileInputStream("D:\\Ducat Videos\\LambdaExpression.java"));
		ByteArrayInputStream bais=new ByteArrayInputStream(a.getBytes());
		int i=0;
		while((i=bais.read())!=-1) {
			System.out.print((char)i);
		}
//		String msg="Ajay is a Good Boy";
//		ByteArrayOutputStream baos=new ByteArrayOutputStream();
//		baos.write(msg.getBytes());
//		baos.writeTo(new FileOutputStream("D://a.txt"));
//		baos.writeTo(new FileOutputStream("D://b.txt"));
//		baos.writeTo(new FileOutputStream("D://c.txt"));
	}
}
