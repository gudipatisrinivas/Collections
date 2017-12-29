package com.collection.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {

	public Object deserialize(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fos = new FileInputStream(filename);
		ObjectInputStream oos = new ObjectInputStream(fos);
		Object obj = oos.readObject();
		oos.close();
		return obj;

	}

	public void serialize(String filename, Object obj) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "/Users/mounikasrinivas/Downloads/serialize2.ser";
		Student stud = new Student("Srinivas", 45, 4);
		SerializationUtil util = new SerializationUtil();
		try {
			util.serialize(fileName, stud);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Object"+util.deserialize(fileName));
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
