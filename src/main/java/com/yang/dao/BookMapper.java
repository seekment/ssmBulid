package com.yang.dao;

import com.yang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName BookMapper
 * @Author yang
 * @Description //TODO
 * @Date 22/07/31 22:07
 * @Version v1.0
 **/

public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookID") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bookID") int id);

    //查询全部的书
    List<Books> queryAllBook();
}

