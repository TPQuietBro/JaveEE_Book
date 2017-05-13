package com.allen.Action;
import com.allen.Oper.BookQuery;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Created by allentang on 2017/5/11.
 */
public class BookAction extends ActionSupport{
    private  String type;
    private BookQuery query = new BookQuery();
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String doQuery() throws  Exception{
        ActionContext.getContext().put("bookList",query.queryByType(this.type));
        return "success";
    }
}
