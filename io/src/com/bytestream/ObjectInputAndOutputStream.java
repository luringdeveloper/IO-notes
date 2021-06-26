package com.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.google.gson.Gson;


class Student implements Serializable {
	private transient int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		System.out.println("Student");
	}
	
}

public class ObjectInputAndOutputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student =new Student();
		student.setName("Ajay");
		student.setRoll(1);
	
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\A.txt"));
		oos.writeObject(new Gson().toJson(student));
		
		
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\A.txt"));
	//	System.out.println(ois.readObject());
		Object o=ois.readObject();
		//System.out.println(o);
		Student s=new Gson().fromJson(o.toString(), Student.class);
//		Student s=(Student)o;
		System.out.println(s.getName()+"\t"+s.getRoll());
		
		
		
	
		
	}

}
