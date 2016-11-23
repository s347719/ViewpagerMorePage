package com.example.test;

import org.litepal.crud.DataSupport;

import java.util.Date;

/**
 * :com.example.test
 * Created by shuhuan on 2016/11/18.
 */
public class Comment extends DataSupport {


    /**
     * 对应一个news信息
     */
    private News news;

    private int id;

    private String content;

    private Date publishDate;



    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }



    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
