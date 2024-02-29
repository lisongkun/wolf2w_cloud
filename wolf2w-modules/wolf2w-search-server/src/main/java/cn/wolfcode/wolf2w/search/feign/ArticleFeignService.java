package cn.wolfcode.wolf2w.search.feign;

import cn.wolfcode.wolf2w.article.dto.DestinationDto;
import cn.wolfcode.wolf2w.article.dto.StrategyDto;
import cn.wolfcode.wolf2w.article.dto.TravelDto;
import cn.wolfcode.wolf2w.core.qo.QueryObject;
import cn.wolfcode.wolf2w.core.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("article-service")
public interface ArticleFeignService {

    @PostMapping("/travels/search")
    R<List<Object>> travelSearchList(@RequestBody QueryObject qo);

    @GetMapping("/travels/findByDestName")
    R<List<TravelDto>> findTravelByDestName(@RequestParam String destName);

    @PostMapping("/strategies/search")
    R<List<Object>> strategySearchList(@RequestBody QueryObject qo);

    @GetMapping("/strategies/findByDestName")
    R<List<StrategyDto>> findStrategyByDestName(@RequestParam String destName);

    @PostMapping("/destinations/search")
    R<List<Object>> destinationSearchList(@RequestBody QueryObject qo);

    @GetMapping("/destinations/getByName")
    R<DestinationDto> getDestByName(@RequestParam String name);

    @GetMapping("/strategies/getById")
    StrategyDto getStrategyById(@RequestParam String id);

    @GetMapping("/travels/detail")
    R<TravelDto> getTravelById(@RequestParam String id);

    @GetMapping("/destinations/detail")
    R<DestinationDto> getDestById(@RequestParam String id);
}
