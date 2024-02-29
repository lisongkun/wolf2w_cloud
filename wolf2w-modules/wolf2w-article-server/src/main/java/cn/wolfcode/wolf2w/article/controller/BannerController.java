package cn.wolfcode.wolf2w.article.controller;

import cn.wolfcode.wolf2w.article.domain.Banner;
import cn.wolfcode.wolf2w.article.service.BannerService;
import cn.wolfcode.wolf2w.core.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banners")
public class BannerController {

    private final BannerService bannerService;

    public BannerController(BannerService bannerService) {
        this.bannerService = bannerService;
    }

    @GetMapping("/travel")
    public R<List<Banner>> travelBanners() {
        return R.ok(bannerService.findByType(Banner.TYPE_TRAVEL));
    }

    @GetMapping("/strategy")
    public R<List<Banner>> strategyBanners() {
        return R.ok(bannerService.findByType(Banner.TYPE_STRATEGY));
    }
}
