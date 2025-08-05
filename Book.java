class Book
{
 private String name;
 static int price;
 int bookid;

public static void main(String[] args)
{
 Book book = new Book();
 book.name = "java";
 book.price =500;
 System.out.println(book.name);
 book.setName("c++");
 System.out.println(book.name);
 System.out.println(book.price);
 book.setPrice(200);
 System.out.println(book.price);
 book.setBookid(1242);
 System.out.println(book.bookid);
}
public void setName(String bookName)
{
 name = bookName;
}
public void setPrice(int bookPrice)
{
 price = bookPrice;
}
public void setBookid(int bookBookid)
{
 bookid = bookBookid;
}
public String getName()
{
 return name;
}
public int getPrice()
{
 return price;
}
public int getBookid()
{
 return bookid;
}
}