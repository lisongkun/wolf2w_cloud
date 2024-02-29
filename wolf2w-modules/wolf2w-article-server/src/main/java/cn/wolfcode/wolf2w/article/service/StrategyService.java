package cn.wolfcode.wolf2w.article.service;

import cn.wolfcode.wolf2w.article.domain.Strategy;
import cn.wolfcode.wolf2w.article.domain.StrategyCatalog;
import cn.wolfcode.wolf2w.article.domain.StrategyContent;
import cn.wolfcode.wolf2w.article.qo.StrategyQuery;
import cn.wolfcode.wolf2w.article.vo.StrategyCondition;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface StrategyService extends IService<Strategy> {

    List<StrategyCatalog> findGroupsByDestId(Long destId);

    StrategyContent getContentById(Long id);

    List<Strategy> findViewnumTop3ByDestId(Long destId);

    Page<Strategy> pageList(StrategyQuery qo);

    List<StrategyCondition> findDestCondition(int abroad);

    List<StrategyCondition> findThemeCondition();

    void viewnumIncr(Long id);

    boolean thumbnumIncr(Long sid);

    Map<String, Object> getStatData(Long id);
}
