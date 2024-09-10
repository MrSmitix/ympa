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
     */
    public ?int $id = null;

    /**
     * Идентификатор родительского ответа.
     * @DTA\Data(field="parentId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $parent_id = null;

    /**
     * Текст ответа.
     * @DTA\Data(field="body", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $body = null;

    /**
     * Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.
     * @DTA\Data(field="createdAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_at = null;

    /**
     * Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.
     * @DTA\Data(field="updatedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $updated_at = null;

    /**
     * @DTA\Data(field="author", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackCommentAuthorDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackCommentAuthorDTO::class})
     */
    public ?\App\DTO\FeedbackCommentAuthorDTO $author = null;

    /**
     * Дочерние ответы.
     * @DTA\Data(field="children", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $children = null;

}
