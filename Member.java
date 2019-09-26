package com.atguigu.jwt.entity;
import lombok.Data;

@Data
public class Member {

    private String id;
    private String openid;
    private String mobile;
    private String password;
    private String nickname;
    private String avatar;
}