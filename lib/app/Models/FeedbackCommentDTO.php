<?php
/**
 * FeedbackCommentDTO
 */
namespace app\Models;

/**
 * FeedbackCommentDTO
 * @description Комментарий к отзыву на магазин.
 */
class FeedbackCommentDTO {

    /** @var int $id Идентификатор ответа.*/
    public $id = 0;

    /** @var int $parentId Идентификатор родительского ответа.*/
    public $parentId = 0;

    /** @var string $body Текст ответа.*/
    public $body = "";

    /** @var \DateTime $createdAt Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.*/
    public $createdAt;

    /** @var \DateTime $updatedAt Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.*/
    public $updatedAt;

    /** @var \app\Models\FeedbackCommentAuthorDTO $author */
    public $author;

    /** @var \app\Models\FeedbackCommentDTO[]|null $children Дочерние ответы.*/
    public $children = null;

}
