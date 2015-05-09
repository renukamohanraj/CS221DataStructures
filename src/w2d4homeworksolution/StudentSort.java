package w2d4homeworksolution;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable
{
    int sid;
    String sname;
    int score;
      Student(int sid, String sname, int score)
      {
    	  this.sid = sid;
    	  this.sname = sname;
    	  this.score = score;
       }
      public int compareTo(Object obj)
  	{
  		Student AObj = (Student )obj;
  		return Integer.compare( this.score, AObj.score);
  	}
}
public class StudentSort {
	public static void main(String[] args) {
	ArrayList<Student> list = new ArrayList<Student>();
	list.add(new Student(123456,"Amala",86));
	list.add(new Student(123457,"Adhi",78));
	list.add(new Student(123458,"Akil",80));
	list.add(new Student(123459,"Arun",76));
	Collections.sort(list);
	System.out.println("Sorted Score List");
	for(Student obj : list)
		System.out.println("(" + obj.sname + ", " + obj.score +")");
}
}
