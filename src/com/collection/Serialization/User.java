package com.collection.Serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class User implements Externalizable {

	// This is required
	public User() {

	}

	private String doNotStoreMe;

	private Integer fieldOne;
	private String fieldTwo;
	private Boolean fieldThree;

	public String getDoNotStoreMe() {
		return doNotStoreMe;
	}

	public void setDoNotStoreMe(String doNotStoreMe) {
		this.doNotStoreMe = doNotStoreMe;
	}

	public Integer getFieldOne() {
		return fieldOne;
	}

	public void setFieldOne(Integer fieldOne) {
		this.fieldOne = fieldOne;
	}

	public String getFieldTwo() {
		return fieldTwo;
	}

	public void setFieldTwo(String fieldTwo) {
		this.fieldTwo = fieldTwo;
	}

	public Boolean isFieldThree() {
		return fieldThree;
	}

	public void setFieldThree(Boolean fieldThree) {
		this.fieldThree = fieldThree;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println( in.readInt());
		System.out.println( in.readObject());
		System.out.println(in.readBoolean());
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(fieldOne);
		out.writeObject(fieldTwo);
		out.writeBoolean(fieldThree);
	}

	public User( Integer fieldOne, String fieldTwo, Boolean fieldThree) {
		super();
		//this.doNotStoreMe = doNotStoreMe;
		this.fieldOne = fieldOne;
		this.fieldTwo = fieldTwo;
		this.fieldThree = fieldThree;
	}

	@Override
	public String toString() {
		return "UserSettings [doNotStoreMe=" + doNotStoreMe + ", fieldOne=" + fieldOne + ", fieldTwo=" + fieldTwo
				+ ", fieldThree=" + fieldThree + "]";
	}

}
