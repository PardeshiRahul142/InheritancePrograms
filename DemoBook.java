//Write a program to create a class Book with data members title, author, and price, and display book details using an object.
class Books
{
	private String title;
	private String author;
	private int price;
	
	Books( String t,String a, int p)
	{   title=t;
		author=a;
		price=p;
	}
	void display()
	{   System.out.println("Title is :"+title);
		System.out.println("Author is :"+author);
		System.out.println("price is :"+price);
	}	
}
public class DemoBook 
{  public static void main(String[] args) 
	{
		Books b=new Books("Java" , "James Gosling",210);
		b.display();

	}

}
