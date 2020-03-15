package com.xunjer.alinsen.service;

import com.xunjer.alinsen.entity.AlinsenEvent;

import java.util.List;

/**
 * @author linsen
 * @date 2020/3/14 20:20
 * @tips 明日复明日 明日何其多
 */
public interface IAlinsenService {

    AlinsenEvent findById(Integer eventId);

    List<AlinsenEvent> findAll();
}
