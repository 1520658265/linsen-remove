package com.xunjer.alinsen.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author linsen
 * @date 2020/3/15 19:35
 * @tips 明日复明日 明日何其多
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultModel<T> {

    private Boolean result ;

    private String messag = "";

    private T returnValue;

    public ResultModel(T t) {
        this.returnValue = t;
        this.result = true;
    }

}
