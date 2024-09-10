<?php
/**
 * UpdateGoodsFeedbackCommentRequest
 */
namespace app\Models;

/**
 * UpdateGoodsFeedbackCommentRequest
 * @description Комментарий к отзыву.
 */
class UpdateGoodsFeedbackCommentRequest {

    /** @var int $feedbackId Идентификатор отзыва.*/
    public $feedbackId = 0;

    /** @var \app\Models\UpdateGoodsFeedbackCommentDTO $comment */
    public $comment;

}
