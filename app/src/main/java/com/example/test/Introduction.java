package com.example.test;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * :com.example.test
 * Created by shuhuan on 2016/11/18.
 */
public class Introduction extends DataSupport {


    private int id;

    private String guide;

    private String digest;




    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
}
