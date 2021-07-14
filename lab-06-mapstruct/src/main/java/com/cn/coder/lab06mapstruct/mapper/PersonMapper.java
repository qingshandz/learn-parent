package com.cn.coder.lab06mapstruct.mapper;

import com.cn.coder.lab06mapstruct.dto.PersonDTO;
import com.cn.coder.lab06mapstruct.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @USER wh
 * @DATE 2021/7/14
 * @Description
 */
@Mapper
public interface PersonMapper {

    PersonMapper INSTANCT = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "name", target = "personName")
    PersonDTO toDto(PersonEntity personEntity);

    PersonEntity toEntity(PersonDTO personDTO);

    List<PersonEntity> toEntity(List<PersonDTO> dtoList);

    List <PersonDTO> toDto(List<PersonEntity> entityList);

}
