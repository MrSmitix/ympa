<?php
/**
 * GoodsFeedbackCommentListDTO
 */
namespace app\Models;

/**
 * GoodsFeedbackCommentListDTO
 * @description Комментарии к отзыву.
 */
class GoodsFeedbackCommentListDTO {

    /** @var \app\Models\GoodsFeedbackCommentDTO[] $comments Список комментариев.*/
    public $comments = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
