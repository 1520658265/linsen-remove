package com.xunjer.alinsen.repository;

import com.xunjer.alinsen.entity.AlinsenEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author linsen
 * @date 2020/3/14 20:14
 * 明日复明日 明日何其多
 */
@Repository
public interface AlinsenEventRepository extends JpaRepository<AlinsenEvent,Integer> {


}
