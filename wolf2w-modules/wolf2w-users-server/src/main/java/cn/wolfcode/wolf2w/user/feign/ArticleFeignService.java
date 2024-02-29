package cn.wolfcode.wolf2w.user.feign;

import cn.wolfcode.wolf2w.core.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("article-service")
public interface ArticleFeignService {

    @GetMapping("/rsa/encrypt/test")
    R<String> getEncryptData();
}
