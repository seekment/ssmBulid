package com.yang.service;

import com.yang.dao.BookMapper;
import com.yang.pojo.Books;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Author yang
 * @Description  service层调用dao层:组合Dao
 * @Date 22/07/31 22:09
 * @Version v1.0
 **/


public class BookServiceImpl implements BookService{

    // service层调用dao层:组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}


