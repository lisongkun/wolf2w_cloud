package cn.wolfcode.wolf2w.article.service.impl;

import cn.wolfcode.wolf2w.article.domain.StrategyRank;
import cn.wolfcode.wolf2w.article.mapper.StrategyRankMapper;
import cn.wolfcode.wolf2w.article.service.StrategyRankService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StrategyRankServiceImpl extends ServiceImpl<StrategyRankMapper, StrategyRank> implements StrategyRankService {

    @Override
    public List<StrategyRank> selectLastRanksByType(int type) {
        QueryWrapper<StrategyRank> wrapper = new QueryWrapper<StrategyRank>()
                .eq("type", type)
                .orderByDesc("statis_time", "statisnum")
                .last("limit 10");
        return list(wrapper);
    }
}
