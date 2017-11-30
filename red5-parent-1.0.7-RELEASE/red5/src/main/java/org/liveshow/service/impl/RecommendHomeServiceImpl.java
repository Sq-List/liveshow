package org.liveshow.service.impl;

import org.liveshow.dao.RecommendHomeMapper;
import org.liveshow.entity.Room;
import org.liveshow.service.RecommendHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Cjn on 2017/11/28.
 */
@Service
public class RecommendHomeServiceImpl implements RecommendHomeService {
    @Autowired
    private RecommendHomeMapper recommendHomeMapper;
    
    @Override
    @Transactional
    public List<Room> findAllRecHome() {
        List<Room> lists = recommendHomeMapper.findRecoRoom();
        if (lists == null || lists.size() == 0){
            return null;
        }
        return lists;
    }
}
