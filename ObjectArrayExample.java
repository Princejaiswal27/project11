package day10;

import java.util.Scanner;

class Student {
	String name;
	int age;
	
	void show()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the name");
		name = s.next();
		System.out.println("enter the age");
		age = s.nextInt();
		
	}
	void display()
	{
		System.out.println(name +" "+ age);
	}

public class ObjectArrayExample {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("How many records do you want to enter");
		int n = s.nextInt();
		
		Student p[] = new Student[n];  //refrence of student class
		
		for(int i=0;i<n;i++)
		{
			p[i] = new Student();
			p[i].show();
		}
		for(int i=0;i<n;i++)
		{
			p[i].display();
		}
		
		

	}

}
}
