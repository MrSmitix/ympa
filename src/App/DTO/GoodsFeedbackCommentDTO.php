<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Комментарий к отзыву.
 */
class GoodsFeedbackCommentDTO
{
    /**
     * Идентификатор комментария к отзыву.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Текст комментария.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":4096})
     * @var string|null
     */
    public $text;

    /**
     * Может ли продавец изменять комментарий или удалять его.
     * @DTA\Data(field="canModify", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $can_modify;

    /**
     * Идентификатор комментария к отзыву.
     * @DTA\Data(field="parentId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $parent_id;

    /**
     * @DTA\Data(field="author")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackCommentAuthorDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackCommentAuthorDTO::class})
     * @var \App\DTO\GoodsFeedbackCommentAuthorDTO|null
     */
    public $author;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackCommentStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackCommentStatusType::class})
     * @var \App\DTO\GoodsFeedbackCommentStatusType|null
     */
    public $status;

}
