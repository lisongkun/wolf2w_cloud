package cn.wolfcode.wolf2w.data.mapper;

import cn.wolfcode.wolf2w.article.domain.Strategy;
import cn.wolfcode.wolf2w.article.domain.StrategyRank;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface StrategyMapper extends BaseMapper<Strategy> {

    List<StrategyRank> selectStrategyRankByAbroad(Integer abroad);

    List<StrategyRank> selectStrategyRankHotList();
}
