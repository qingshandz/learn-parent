package com.cn.coder.lab06mapstruct.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PersonEntity {

    String describe;

    private String id;

    private String name;

    private int age;

    private BigDecimal source;

    private double height;

    private Date createTime;

}
