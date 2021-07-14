package com.cn.coder.lab06mapstruct;

import com.cn.coder.lab06mapstruct.dto.PersonDTO;
import com.cn.coder.lab06mapstruct.entity.PersonEntity;
import com.cn.coder.lab06mapstruct.mapper.PersonMapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @USER wh
 * @DATE 2021/7/14
 * @Description
 */
public class Main {
    public static void main(String[] args) {

            PersonEntity personEntity = new PersonEntity();
            personEntity.setDescribe("测试");
            personEntity.setAge(18);
            personEntity.setName("张三");
            personEntity.setHeight(170.5);
            personEntity.setSource(new BigDecimal("100"));

            PersonDTO dto = PersonMapper.INSTANCT.toDto(personEntity);

            System.out.println(dto);
            // PersonDTO(describe=测试, id=null, personName=张三, age=18, source=100, height=170.5)

    }

    public static void covert(){
        List<PersonEntity> listEntity = new ArrayList<>();
        PersonEntity personEntity = new PersonEntity();
        personEntity.setDescribe("测试");
        personEntity.setAge(18);
        personEntity.setName("张三");
        personEntity.setHeight(170.5);
        personEntity.setSource(new BigDecimal("100"));

    }
}
