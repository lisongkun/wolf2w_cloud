package cn.wolfcode.wolf2w.article.service;

import cn.wolfcode.wolf2w.article.domain.Region;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface RegionService extends IService<Region> {

    List<Region> findHotList();
}
