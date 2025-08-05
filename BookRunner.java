class BookRunner
{
 public static void main(String[] args)
{
 Book book = new Book();
 System.out.println(book.getName());
 book.setName("os");
 System.out.println(book.getName());
 book.setPrice(600);
 System.out.println(book.getPrice());
 book.setBookid(56324);
 System.out.println(book.getBookid());
}
}