package cn.wolfcode.wolf2w.data.mapper;

import cn.wolfcode.wolf2w.article.domain.StrategyRank;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface StrategyRankMapper extends BaseMapper<StrategyRank> {
    void batchInsert(List<StrategyRank> strategyRanks);
}
