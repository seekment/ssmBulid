package com.yang.service;

import com.yang.pojo.Books;

import java.util.List;

/**
 * @ClassName BookService
 * @Author yang
 * @Description //TODO
 * @Date 22/07/31 22:08
 * @Version v1.0
 **/


public interface BookService {


    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部的书
    List<Books> queryAllBook();
}
