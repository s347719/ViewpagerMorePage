package com.example.test;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * :com.example.test
 * Created by shuhuan on 2016/11/18.
 */
public class News extends DataSupport{



    private Introduction introduction;


    private int id;

    private String title;

    private String content;

    private Date publishDate;

    private int commentCount;

    /**
     * 对应多个comment 信息
     */
    private List<Comment> commentList = new ArrayList<Comment>();

    /**
     * 对应多个category信息
     */
    private List<Category> categoryList = new ArrayList<Category>();

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }


    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Comment> getComments(){
        return DataSupport.where("news_id = ?",String.valueOf(id)).find(Comment.class);
    }

    public Introduction getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Introduction introduction) {
        this.introduction = introduction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
