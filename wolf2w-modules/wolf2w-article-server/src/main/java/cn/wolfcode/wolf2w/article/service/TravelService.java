package cn.wolfcode.wolf2w.article.service;

import cn.wolfcode.wolf2w.article.domain.Travel;
import cn.wolfcode.wolf2w.article.qo.TravelQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface TravelService extends IService<Travel> {

    Page<Travel> pageList(TravelQuery query);
}
