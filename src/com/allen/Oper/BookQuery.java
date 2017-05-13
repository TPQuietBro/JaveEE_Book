package com.allen.Oper;
import com.allen.Dao.DBConnection;
import com.allen.Model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
/**
 * Created by allentang on 2017/5/11.
 */
public class BookQuery {
    public List<Book> queryByType(String type) throws Exception{
        PreparedStatement pre = null;
        ResultSet rs = null;
        Connection conn = DBConnection.getConnection();
        pre = conn.prepareStatement("select * from allen_book where type = '" + type + "'");
        rs = pre.executeQuery();

        List<Book> bookList = new ArrayList<Book>();
        while (rs.next()){
            Book book = new Book();
            book.setId(rs.getInt(1));
            book.setName(rs.getString(2));
            book.setPrice(rs.getString(3));
            book.setType(rs.getString(4));
            bookList.add(book);
        }
        if (conn != null){
            conn.close();
        }
        if (pre != null){
            pre.close();
        }
        if (rs != null){
            rs.close();
        }
        return bookList;
    }
}
