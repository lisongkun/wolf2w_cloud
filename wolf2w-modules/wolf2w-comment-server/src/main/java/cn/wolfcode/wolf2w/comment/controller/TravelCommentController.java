package cn.wolfcode.wolf2w.comment.controller;

import cn.wolfcode.wolf2w.auth.anno.RequireLogin;
import cn.wolfcode.wolf2w.comment.domain.TravelComment;
import cn.wolfcode.wolf2w.comment.service.TravelCommentService;
import cn.wolfcode.wolf2w.core.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/travels/comments")
@RestController
public class TravelCommentController {

    private final TravelCommentService travelCommentService;

    public TravelCommentController(TravelCommentService travelCommentService) {
        this.travelCommentService = travelCommentService;
    }

    @GetMapping("/query")
    public R<List<TravelComment>> query(Long travelId) {
        return R.ok(travelCommentService.findList(travelId));
    }

    @RequireLogin
    @PostMapping("/save")
    public R<?> save(TravelComment comment) {
        travelCommentService.save(comment);
        return R.ok();
    }
}
