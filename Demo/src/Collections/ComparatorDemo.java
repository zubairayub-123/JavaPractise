package Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

class Student{
	String name;
	int rollno;
	int age;
	
	Student(String name, int rollno, int age){
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
}

class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		if(s1.age==s2.age) {
			return 0;
		}
		else if(s1.age>s2.age) {
			return 1;
		}
		else
			return -1;
	}
	
}

class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		return s1.name.compareTo(s2.name);
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList li = new ArrayList();
		li.add(new Student("Ayub",13,25));
		li.add(new Student("Zubair",11,23));
		li.add(new Student("Basha",23,35));
		
		
		System.out.println("Sorting by name");
		
		Collections.sort(li,new NameComparator());
		
		Iterator i = li.iterator();
		
		while(i.hasNext()) {
			Student st = (Student)i.next();
			System.out.println(st.name +" " + st.rollno +" "+ st.age);
		}
	}

}
