package com.catch_me_study.catch_me_study.domain.user.dto;

import com.catch_me_study.catch_me_study.domain.common.BaseDto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends BaseDto {

    @NotBlank
    @Size(max = 100)
    @Email
    private String email;

    @NotBlank
    @Size(max = 80)
    private String password;

    @NotBlank
    @Size(max = 50)
    private String name;
}
