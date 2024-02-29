package cn.wolfcode.wolf2w.comment.service;

import cn.wolfcode.wolf2w.comment.domain.StrategyComment;
import cn.wolfcode.wolf2w.comment.qo.CommentQuery;
import org.springframework.data.domain.Page;

public interface StrategyCommentService {

    Page<StrategyComment> page(CommentQuery qo);

    void save(StrategyComment comment);

    void doLike(String cid);

    void replyNumIncr(Long strategyId);
}
