package cn.wolfcode.wolf2w.article.service;

import cn.wolfcode.wolf2w.article.domain.StrategyRank;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface StrategyRankService extends IService<StrategyRank> {

    List<StrategyRank> selectLastRanksByType(int type);
}
