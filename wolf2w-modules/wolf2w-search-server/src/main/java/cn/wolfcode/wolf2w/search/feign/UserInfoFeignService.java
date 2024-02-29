package cn.wolfcode.wolf2w.search.feign;

import cn.wolfcode.wolf2w.core.utils.R;
import cn.wolfcode.wolf2w.user.dto.UserInfoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("user-service")
public interface UserInfoFeignService {

    /**
     * 如果 Feign 发起远程调用后, 接收的类型没有明确表示具体类型是什么
     * Feign 会将返回的 JSON 结构转换为一个 LinkedHashMap 对象
     */
    @GetMapping("/users")
    R<List<Object>> findList(@RequestParam Integer current, @RequestParam Integer limit);

    @GetMapping("/users/findByDestName")
    R<List<UserInfoDTO>> findUserByDestName(@RequestParam String destName);

    @GetMapping("/users/getById")
    R<UserInfoDTO> getById(@RequestParam String id);
}
