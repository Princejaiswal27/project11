package day12;
//by default only no argument constructor of base class is always called
//so to explicitly call parameterized constructor we use super keyword 
class Gadget1
{
	Gadget1()	    {		System.out.println("gadget");	}
	Gadget1(int i)	{		System.out.println("gadget _parameter");	}

}

class mobile1 extends Gadget1
{
	mobile1()	{		System.out.println("mobile ");	}
	mobile1(int y){
		super(y);
		System.out.println("mobile parameter");}
	
}
class samsung1 extends mobile1 
{
	samsung1()	{		System.out.println("samsung");	}
	samsung1(int e)	{
		super(e);  //super must be the first statement in constructor 
		System.out.println("samsung parameter");	}
}

public class Constructor_In_Inheritance_2 {

	public static void main(String[] args) {
		samsung1 k= new samsung1(122334);

	}

}
