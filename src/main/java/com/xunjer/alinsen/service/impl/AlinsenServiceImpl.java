package com.xunjer.alinsen.service.impl;

import com.xunjer.alinsen.entity.AlinsenEvent;
import com.xunjer.alinsen.repository.AlinsenEventRepository;
import com.xunjer.alinsen.service.IAlinsenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linsen
 * @date 2020/3/14 20:21
 * @tips 明日复明日 明日何其多
 */
@Service
public class AlinsenServiceImpl implements IAlinsenService {

    @Autowired
    private AlinsenEventRepository alinsenEventRepository;

    @Override
    public AlinsenEvent findById(Integer id) {
        return alinsenEventRepository.getOne(id);
    }

    @Override
    public List<AlinsenEvent> findAll() {
        return alinsenEventRepository.findAll();
    }
}
