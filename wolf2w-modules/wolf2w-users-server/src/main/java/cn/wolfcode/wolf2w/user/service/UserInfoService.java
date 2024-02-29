package cn.wolfcode.wolf2w.user.service;

import cn.wolfcode.wolf2w.user.domain.UserInfo;
import cn.wolfcode.wolf2w.user.dto.UserInfoDTO;
import cn.wolfcode.wolf2w.user.vo.RegisterRequest;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface UserInfoService extends IService<UserInfo> {

    /**
     * 基于手机号查询用户对象
     *
     * @param phone 手机号
     * @return 用户对象
     */
    UserInfo findByPhone(String phone);

    /**
     * 注册接口
     *
     * @param req 注册请求对象
     */
    void register(RegisterRequest req);

    /**
     * 登录接口
     *
     * @param username 用户名
     * @param password 密码
     * @return {token, 用户}
     */
    Map<String, Object> login(String username, String password);

    UserInfoDTO getDtoById(Long id);

    List<Long> getFavorStrategyIdList(Long userId);

    boolean favoriteStrategy(Long sid);
}
