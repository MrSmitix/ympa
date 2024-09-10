<?php
/**
 * FeedbackCommentAuthorDTO
 */
namespace app\Models;

/**
 * FeedbackCommentAuthorDTO
 * @description Информация об авторе комментария.
 */
class FeedbackCommentAuthorDTO {

    /** @var string $type */
    public $type = "";

    /** @var string $name Имя автора отзыва или название магазина.*/
    public $name = "";

}
