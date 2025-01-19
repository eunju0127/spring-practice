package com.catch_me_study.catch_me_study.domain.user.entity;

import com.catch_me_study.catch_me_study.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user")
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(nullable = false, insertable = false, updatable = false)
    @Comment("기본키 UUID")
    private String id;

    @Column(length = 100, nullable = false)
    @Comment("사용자 이메일")
    private String email;

    @Column(length = 80, nullable = false)
    @Comment("사용자 비밀번호")
    private String password;

    @Column(length = 50, nullable = false)
    @Comment("사용자명")
    private String name;

    @Column(nullable = false)
    private Boolean isDeleted = false;


    public void delete() {
        this.isDeleted = true;
    }

    public void update(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}

