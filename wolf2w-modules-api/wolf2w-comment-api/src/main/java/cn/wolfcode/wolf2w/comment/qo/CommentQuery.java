package cn.wolfcode.wolf2w.comment.qo;

import cn.wolfcode.wolf2w.core.qo.QueryObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentQuery extends QueryObject {

    private Long articleId;
}
