package cn.wolfcode.wolf2w.user.controller;

import cn.wolfcode.wolf2w.core.utils.R;
import cn.wolfcode.wolf2w.user.service.SmsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class SmsController {

    private final SmsService smsService;

    public SmsController(SmsService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/register")
    public R<?> registerVerifyCode(String phone) {
        smsService.registerSmsSend(phone);
        return R.ok();
    }
}
