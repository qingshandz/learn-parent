package com.cn.coder.lab06mapstruct.dto;

import lombok.Data;

/**
 * @USER wh
 * @DATE 2021/7/14
 * @Description
 */
@Data
public class PersonDTO {

    String describe;

    private Long id;

    private String personName;

    private String age;

    private String source;

    private String height;

}
