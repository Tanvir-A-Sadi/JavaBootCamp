package aryListPackage;

import java.util.ArrayList;

public class AryListMain {

	public static void main(String[] args) {
		Student st1 = new Student("Tanvir", 120, 30);
		Student st2 = new Student("Tania", 121, 28);
		Student st3 = new Student("Tanjid", 122, 27);
		Student st4 = new Student("Shakera", 124, 25);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		System.out.println(list.get(0).name +" "+list.get(0).id+" "+list.get(0).age);
		
	}

}
