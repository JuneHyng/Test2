package com.himedia.hello;

import lombok.Data;

import java.util.Date;

@Data
public class TestVO {

    private int seq;
    private String name;
    private String password;
    private String content;
    private Date created_at;

}
