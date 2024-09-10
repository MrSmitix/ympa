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
     */
    public ?int $id = null;

    /**
     * Текст комментария.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1, "max":4096})
     */
    public ?string $text = null;

    /**
     * Может ли продавец изменять комментарий или удалять его.
     * @DTA\Data(field="canModify", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $can_modify = null;

    /**
     * Идентификатор комментария к отзыву.
     * @DTA\Data(field="parentId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $parent_id = null;

    /**
     * @DTA\Data(field="author")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackCommentAuthorDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackCommentAuthorDTO::class})
     */
    public ?\App\DTO\GoodsFeedbackCommentAuthorDTO $author = null;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackCommentStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackCommentStatusType::class})
     */
    public ?\App\DTO\GoodsFeedbackCommentStatusType $status = null;

}
