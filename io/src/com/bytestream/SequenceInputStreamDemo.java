package com.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// What is Enumeration.
		//Enumeration is an interface that exist on java.util package that is used to iterate multiple object.
		// How to get Enumeration object.
		//We have vector class in java.util package that has a method to return Enumeration object.
		
		//Create a vector object.
		
		Vector v=new Vector();
		v.add(new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.txt"));
		v.add(new FileInputStream("C:\\Users\\Administrator\\Desktop\\2.txt"));
		v.add(new FileInputStream("C:\\Users\\Administrator\\Desktop\\3.txt"));
		
		Enumeration e=v.elements();
		
		//SequenceInputStream is used to to read data from multiple file in a sequence.
		SequenceInputStream si=new SequenceInputStream(e);
		int i=0;
		while((i=si.read())!=-1){
			System.out.println((char)i);
		}
		
		
//		// How to read only two file using SequenceInputSream.
//		SequenceInputStream si=new SequenceInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.txt"), new FileInputStream("C:\\Users\\Administrator\\Desktop\\2.txt"));
//		int i=0;
//		while((i=si.read())!=-1){
//			System.out.println((char)i);
//			}
		
	}
}
