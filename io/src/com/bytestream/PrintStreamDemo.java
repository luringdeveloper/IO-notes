package com.bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
public static void main(String[] args) throws FileNotFoundException {
	
	File f=new File("D://qw.txt");
//	PrintStream ps= new PrintStream(System.out);
//	ps.print("dasdasdasd");
	
	PrintStream ps= new PrintStream(new FileOutputStream(f));
	ps.print("hello worldsdasxd");

	ps.close();

//write();
//IOException
	


}
}
