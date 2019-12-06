class Author
{
  private String name,email;
  private char gender;
  Author(String name,String email,char gender)
  {
    this.name=name;
    this.email=email;
    this.gender=gender;
    System.out.println("AUTHOR NAME IS "+name);
    System.out.println("AUTHOR EMAIL IS "+email);
    System.out.println("AUTHOR GENDER IS "+gender);
  }
}
class Book
{
  private String name;
  private Author author;
  private double price;
  private int qtyInStock;
  Book(String name)
  {
    this.name=name;
  }

  String getName()
  {
    return name;
  }
  Author getAuthor(Author author)
  {
    return author;
  }
  double getPrice()
  {
    return price;
  }
  int getQtyInStock()
  {
    return qtyInStock;
  }
   void setPrice(double price)
   {
    this.price=price;
   }
   void setQtyInStock(int qtyInStock)
   {
     this.qtyInStock=qtyInStock;
   }
 }
class P38
{
  public static void main(String args[])
  {
    Book aBook=new Book("THE GIRL NEXT DOOR");
    aBook.setPrice(345);
    aBook.setQtyInStock(5000);
    System.out.println("BOOK NAME IS "+aBook.getName());
    System.out.println("BOOK PRICE IS "+aBook.getPrice());
    System.out.println("BOOK STOCK IS "+aBook.getQtyInStock());
    Author a=new Author("CHETHAN","chetan23",'M');
  }
}
    
