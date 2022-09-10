package dao;

import pojo.Book;

public class BookDaoImpl implements BookDao {

    @Override
    public void save(Book book) {
        System.out.println("book对象已经入库成功");
    }
}
