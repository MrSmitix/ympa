<?php
/**
 * GoodsFeedbackCommentDTO
 */
namespace app\Models;

/**
 * GoodsFeedbackCommentDTO
 * @description Комментарий к отзыву.
 */
class GoodsFeedbackCommentDTO {

    /** @var int $id Идентификатор комментария к отзыву.*/
    public $id = 0;

    /** @var string $text Текст комментария.*/
    public $text = "";

    /** @var bool $canModify Может ли продавец изменять комментарий или удалять его.*/
    public $canModify = false;

    /** @var int $parentId Идентификатор комментария к отзыву.*/
    public $parentId = 0;

    /** @var \app\Models\GoodsFeedbackCommentAuthorDTO $author */
    public $author;

    /** @var string $status */
    public $status = "";

}
