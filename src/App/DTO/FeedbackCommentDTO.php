<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Комментарий к отзыву на магазин.
 */
class FeedbackCommentDTO
{
    /**
     * Идентификатор ответа.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Идентификатор родительского ответа.
     * @DTA\Data(field="parentId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $parent_id;

    /**
     * Текст ответа.
     * @DTA\Data(field="body", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $body;

    /**
     * Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.
     * @DTA\Data(field="createdAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $created_at;

    /**
     * Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.
     * @DTA\Data(field="updatedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $updated_at;

    /**
     * @DTA\Data(field="author", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackCommentAuthorDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackCommentAuthorDTO::class})
     * @var \App\DTO\FeedbackCommentAuthorDTO|null
     */
    public $author;

    /**
     * Дочерние ответы.
     * @DTA\Data(field="children", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\FeedbackCommentDTO[]|null
     */
    public $children;

}
