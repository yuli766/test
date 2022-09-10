package service;

import dao.BookDao;
import pojo.Book;

public class BookServiceImpl implements BookService{
    private String out;

    public void setOut(String out) {
        this.out = out;
    }

    public BookServiceImpl(BookDao bookDao,String out) {
        this.bookDao = bookDao;
        this.out = out;
    }
    public BookServiceImpl() {

    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    private BookDao bookDao;
    @Override
    public void add(Book book) {
        System.out.println(this.out);
        bookDao.save(book);
    }
}
