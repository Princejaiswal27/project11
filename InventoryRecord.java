package day10;
import java.util.Scanner; 
public class InventoryRecord {
	
	String pname;
	int pid , price ;
	
	
	void store()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Product name");
		String pname = s.next();
		System.out.println("Enter Product Id");
		int pid = s.nextInt();
		System.out.println("Enter Product Price");
		int pname = s.nextInt();
	}
	
	void display()
	{
		System.out.println(pname+ " "+pid+ " "+price );
	}
	void search(InventoryRecord j[] ,String name)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Product name you want to search");
		String d = s.next();
		for(int i=0;i<5;i++)
		{
			if(j[i].pname.equals(name))
			{
				System.out.println("product found");
			}
		}
	}
	
	public static void main(String[] args) {
		
		InventoryRecord k[] = new InventoryRecord[5];
		
		for(int i=0;i<5;i++);
		{
			k[i]= new InventoryRecord();
			k[i].store();
		}
		for(int i=0;i<5;i++);
		{
			
			k[i].display();
		}
		InventoryRecord s = InventoryRecord();
		s.search(k, monitor);
	}

}
