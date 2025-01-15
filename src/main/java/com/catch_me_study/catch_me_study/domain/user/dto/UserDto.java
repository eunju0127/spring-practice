package com.catch_me_study.catch_me_study.domain.user.dto;

import com.catch_me_study.catch_me_study.domain.common.BaseDto;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.validator.constraints.Length;
import org.mapstruct.Mapper;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends BaseDto {

    @NotNull
    @Length(max = 255)
    private String id;

    @NotNull
    @Length(max = 100)
    private String email;

    @NotNull
    @Length(max = 80)
    private String password;

    @NotNull
    @Length(max = 50)
    private String name;
}
