package com.example.test;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * :com.example.test
 * Created by shuhuan on 2016/11/18.
 */
public class Category extends DataSupport {


    private int id;

    private String name;


    /**
     * 对应多个news信息
     */
    private List<News> newsList = new ArrayList<News>();

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
