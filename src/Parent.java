
public class Parent
{
	void show()
	{
		System.out.println("Parent's show");
	}
}
class ChildeExtendsParents
{
	void show()
	{
		System.out.println("Child's show");
	}
}
class Main
{
	public static void main(String[]args)
	{
		Parent ob1=new Parent();
		ob1.show();
		
		Parent ob2=new Parent();
		ob2.show();
		
		
	}
}
