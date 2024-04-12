package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashsetDemo {
    public static void main(String[] args) {
        //creating arraylist for book
   // ArrayList<Book> list=new ArrayList<Book>();
    // list.add(new Book("agni", "jpj", 101, 200));
    // list.add(new Book("java", "james gosling",102 , 300));
    // list.add(new Book("python", "monty", 103, 400));
// passing the values from arraylist to hashset

HashSet<Book> set=new HashSet<Book>();
Book b1=new Book("agni", "jpj", 101, 200);
Book b2=new Book("agni", "games", 102, 100);
Book b3=new Book("java", "keviin", 103, 300);
set.add(b1);
set.add(b2);
set.add(b3);



Iterator it=set.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}
        
    }

   
    
    
}
 class Book{
    String name;
    String Author;
    int b_id;
    int price;
    public Book(String name, String author, int b_id, int price) {
        this.name = name;
        Author = author;
        this.b_id = b_id;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book [name=" + name + ", Author=" + Author + ", b_id=" + b_id + ", price=" + price + "]";
    }

   
    
 }
