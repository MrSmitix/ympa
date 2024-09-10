<?php
/**
 * UpdateGoodsFeedbackCommentDTO
 */
namespace app\Models;

/**
 * UpdateGoodsFeedbackCommentDTO
 * @description Комментарий к отзыву или другому комментарию.
 */
class UpdateGoodsFeedbackCommentDTO {

    /** @var int $id Идентификатор комментария к отзыву.*/
    public $id = 0;

    /** @var int $parentId Идентификатор комментария к отзыву.*/
    public $parentId = 0;

    /** @var string $text Текст комментария.*/
    public $text = "";

}
