package day10;
//command line argument
//passing input to main

//first way ------- code is in notepad
//compile -------> javac filename(CMPDExample).java
//run ----> CMDExample
//run ------> CMDExample neha 33 445 2322 ......

//second way -------to run from eclipse
//rightclick go to run program
//rum---->run configration------>choose file from left hand side ---> select argument tab
//the write argument you want to pass 

public class CMDExample {

	public static void main(String[] args) {
		
		System.out.println(args[0] +" "+ args[1]); //to print
		for(String l : args)        // another method to print
		{
			System.out.println(l);
		}

	}

}
