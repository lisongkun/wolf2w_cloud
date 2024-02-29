package cn.wolfcode.wolf2w.article.service;

import cn.wolfcode.wolf2w.article.domain.StrategyCatalog;
import cn.wolfcode.wolf2w.article.vo.StrategyCatalogGroup;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface StrategyCatalogService extends IService<StrategyCatalog> {

    List<StrategyCatalogGroup> findGroupList();
}
