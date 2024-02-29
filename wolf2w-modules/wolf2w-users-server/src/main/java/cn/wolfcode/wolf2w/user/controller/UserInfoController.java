package cn.wolfcode.wolf2w.user.controller;

import cn.wolfcode.wolf2w.auth.anno.RequireLogin;
import cn.wolfcode.wolf2w.core.utils.R;
import cn.wolfcode.wolf2w.user.domain.UserInfo;
import cn.wolfcode.wolf2w.user.dto.UserInfoDTO;
import cn.wolfcode.wolf2w.user.service.UserInfoService;
import cn.wolfcode.wolf2w.user.vo.RegisterRequest;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Api(value = "用户管理", tags = "用户登录注册等功能")
@RestController
@RequestMapping("/users")
public class UserInfoController {

    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @RequireLogin
    @PostMapping("/favor/strategies")
    public R<Boolean> favoriteStrategy(Long sid) {
        boolean ret = userInfoService.favoriteStrategy(sid);
        return R.ok(ret);
    }

    @GetMapping("/favor/strategies")
    public R<List<Long>> getFavorStrategyIdList(Long userId) {
        List<Long> list = userInfoService.getFavorStrategyIdList(userId);
        return R.ok(list);
    }

    @GetMapping("/phone/exists")
    public R<Boolean> checkPhoneExists(String phone) {
        return R.ok(userInfoService.findByPhone(phone) != null);
    }

    @ApiOperation(value = "登录功能", notes = "基于 JWT 实现用户登录")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name="username", value="用户名", paramType = "body"),
            @ApiImplicitParam(name="password", value="密码", paramType = "body")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "登录成功"),
            @ApiResponse(code = 401, message = "用户名或密码错误"),
            @ApiResponse(code = 400, message = "参数错误")
    })
    @PostMapping("/login")
    public R<Map<String, Object>> login(String username, String password) {
        Map<String, Object> map = userInfoService.login(username, password);
        return R.ok(map);
    }

    @PostMapping("/register")
    public R<?> register(RegisterRequest req) {
        userInfoService.register(req);
        return R.ok();
    }

    @GetMapping("/getById")
    public R<UserInfoDTO> getById(Long id) {
        return R.ok(userInfoService.getDtoById(id));
    }

    @GetMapping("/findByDestName")
    public R<List<UserInfo>> findUserByDestName(@RequestParam String destName) {
        return R.ok(userInfoService.list(new QueryWrapper<UserInfo>().eq("city", destName)));
    }

    @GetMapping
    public R<List<UserInfoDTO>> findList(Integer current, Integer limit) {
        int offset = (current - 1) * limit;
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<UserInfo>()
                .last("limit " + offset + ", " + limit);

        List<UserInfoDTO> dtoList = userInfoService.list(wrapper)
                .stream()
                .map(UserInfo::toDto)
                .collect(Collectors.toList());
        return R.ok(dtoList);
    }
}
