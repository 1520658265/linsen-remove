package com.xunjer.alinsen.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by linsen
 * Date on 2020/3/14 20:04
 * 明日复明日 明日何其多
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alinsen_event")
public class AlinsenEvent {

    @Id
    @GeneratedValue
    @Column(name = "eventId")
    private Integer eventId;

    @Column(name = "content")
    private String content;

    @Column(name = "createDate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    @Column(name = "eventDate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date eventDate;

    @Column(name = "status")
    private Integer status;

    @Column(name = "score")
    private Integer score;

    @Column(name = "owner")
    private Integer owner;

    @Column(name = "tagId")
    private Integer tagId;
}
