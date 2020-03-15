package com.xunjer.alinsen.common.model;

import lombok.Data;

import java.util.List;

/**
 * @author linsen
 * @date 2020/3/15 19:36
 * @tips 明日复明日 明日何其多
 */
@Data
public class PageList<T> {

    private Long total;

    private List<T> list;
}
