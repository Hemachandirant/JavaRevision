package Hema;

import java.util.Arrays;

public class ArrayObject {
	public static void main(String[]args) {

	Student s1 = new Student();
	s1.name = "Hema";
	s1.id = 1;
	s1.marks = 90;
	
	Student s2 = new Student();
	s2.name = "kas";
	s2.id = 2;
	s2.marks = 100;
	
	Student[] Students = new Student[2];
	Students[0] = s1;
	Students[1] = s2;
	
	for (int i = 0; i < Students.length; i++) {
	System.out.println(Students[i].name + ": "+Students[i].id+": "+Students[i].marks);	
	}
	
	for(Student stud: Students) {
		System.out.println(stud.id+": "+stud.name);
	}
	
	
	}

}

class Student{
	String name;
	int id;
	double marks;
}
