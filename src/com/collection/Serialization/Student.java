package com.collection.Serialization;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6470090944414208496L;
	private String name;
	private int rollNumber;
	private int classNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getClassNo() {
		return classNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

	public Student(String name, int rollNumber, int classNo) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.classNo = classNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", classNo=" + classNo + "]";
	}

	
}
