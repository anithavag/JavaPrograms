package mylearning;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

private static String name;
private int[] marks; //for Arrays

//ArrayList <Integer> marks = new ArrayList<Integer>();


public Student(String name, int... marks) { //int... for int []
		this.name = name;
		this.marks = marks;
	}

//public Student(String string, int i, int j, int k, int l) {
	// TODO Auto-generated constructor stub


public static String getName() {
	return name;
}


public int getMarks() {
	return marks.length;
}

public  int getSumOfMarks() {
	int sum =0;
	for (int mark : marks) {
		sum = sum + mark;
	}
	return sum;
}


public int getMaxMarks() {
	int max =Integer.MIN_VALUE;
	for (int mark : marks) {
	if(mark>max) {
		max = mark;
	}
	}
	return max;
}

public int getMinMarks() {
	int min =Integer.MAX_VALUE;
	for (int mark : marks) {
	if(mark<min)
		min = mark;
	}
	return min;
}

public double getAvgOfMarks() {
	int sum = getSumOfMarks();
	double avg = sum/marks.length;
	return avg;
}


public static void main(String [] args) {
	
//int [] marks = {98, 65,85,94,97};

	Student stud = new Student("AAA" , 98, 87, 97,88);
	

	stud.getName();
	System.out.println("Stud Name:" +getName());
	
	int marks1 = stud.getMarks();
	System.out.println("Get marks : " +marks1);
	
	int sum = stud.getSumOfMarks();
	System.out.println("Sum :" +sum);
	
	int maxMarks = stud.getMaxMarks();
	System.out.println("Max Mark:" +maxMarks);
	
	int minMarks = stud.getMinMarks();
	System.out.println("Min Mark:" +minMarks);
	
	double avg = stud.getAvgOfMarks();
	System.out.println("Average:" +avg);
	
}





}
