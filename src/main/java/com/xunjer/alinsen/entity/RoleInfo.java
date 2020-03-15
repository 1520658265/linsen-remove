package com.xunjer.alinsen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author linsen
 * @date 2020/3/15 21:09
 * @tips 明日复明日 明日何其多
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role_info")
public class RoleInfo {

    @Id
    @GeneratedValue
    @Column(name = "roleId")
    private Integer roleId;

    @Column(name = "menuName")
    private String menuName;

    @Column(name = "authName")
    private String authName;


}
