/**
 * 
 */
package com.collections.List;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author Srinivas
 *
 */
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Srinivas");
		arrayList.add("Satya");
		arrayList.add("Sankara");
		arrayList.add("Gudipati");
		arrayList.add("GSS");
		System.out.println(arrayList);
		
		System.out.println(arrayList.contains("Srinivas"));
		System.out.println(arrayList.iterator());
		ListIterator<String> itr=arrayList.listIterator();
		while(itr.hasNext()) {
			if(itr.next().equals("Srinivas")) {
				System.out.println("Truee");
				itr.remove();
			}
		}
		System.out.println(arrayList);

	}

}
