package com.xunjer.alinsen.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author linsen
 * @date 2020/3/15 20:59
 * @tips 明日复明日 明日何其多
 */
@Entity
@Data
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue
    @Column(name = "userId")
    private Integer userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "passsword")
    private String passsword;

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "avator")
    private String avator;

    @Column(name = "role")
    private String role;


}
