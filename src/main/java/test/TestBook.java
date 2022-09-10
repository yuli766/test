package test;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Book;
import service.BookService;


public class TestBook {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = (Book) context.getBean("book");
        BookService bookService1 = (BookService) context.getBean("bookService1");
        System.out.println(book.toString());
        bookService1.add(book);
    }
    @Test
    public void test02(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = (Book) context.getBean("book");
        BookService bookService2 = (BookService) context.getBean("bookService2");
        System.out.println(book.toString());
        bookService2.add(book);
    }
}
