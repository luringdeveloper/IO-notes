package com.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputAndInputStream {

	public static void main(String[] args) throws IOException {
		
		//Primitive type of data if we want to write then we can use DataOutputStream and
		//If we want to read primitive data then we have DataInputStream.

		
		DataOutputStream di=new DataOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Q.txt"));
		di.writeInt(12345);
		
		DataInputStream d= new DataInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\Q.txt"));
		System.out.println(d.readInt());
	}
}
