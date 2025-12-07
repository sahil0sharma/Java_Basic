package Inheritance.practice;
//Base class Library:
//
//protected method display()
//
//Derived class Book:
//
//Override display() and make it public
//
//Print parent details then book details
//
//This question tests access modifier increase rule.

class Library{
    private String libname;
    private int libarea;

    Library(String n, int a){
        this.libname = n;
        this.libarea = a;
    }

    public String getlibname(){
        return libname;
    }
    public int getlibarea(){
        return libarea;
    }

    protected void display(){
        System.out.println(libname);
        System.out.println(libarea);
    }
}
class book extends Library{
    private String bookname;
    private int bookno;

    book(String libname, int libarea, String bookname, int bookno){
        super(libname, libarea);
        this.bookname = bookname;
        this.bookno = bookno;
    }

    public String getbookname(){
        return bookname;
    }
    public int getbookno(){
        return bookno;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(bookname);
        System.out.println(bookno);
    }

}
public class Question5 {
    public static void main(String[] args) {

        book b = new book("Oxford",46,"the art of seduction", 12 );
        b.display();

    }
}
