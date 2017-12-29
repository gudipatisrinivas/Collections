package com.collection.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserSettingMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		UserSettings test = new UserSettings(1,"2",true);

		FileOutputStream fos = new FileOutputStream("/Users/mounikasrinivas/Downloads/external.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		test.writeExternal(oos);
		
		FileInputStream fis = new FileInputStream("/Users/mounikasrinivas/Downloads/external.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		test.readExternal(ois);

	}

}
