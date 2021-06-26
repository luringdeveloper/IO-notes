package com.characterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		
		// if we want to read data from console and write data into file using line by line
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
//		while(!line.equals("stop")) {
//			System.out.println(line);
//		
//			line=br.readLine();
//		}
		
		File f=new File("D://qwt.txt");
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D://qwt.txt")));
		while(!line.equals("stop")) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			line=br.readLine();
		}
	
		
		
		

	}

}
