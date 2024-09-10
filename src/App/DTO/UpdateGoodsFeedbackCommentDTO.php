<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Комментарий к отзыву или другому комментарию.
 */
class UpdateGoodsFeedbackCommentDTO
{
    /**
     * Идентификатор комментария к отзыву.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Идентификатор комментария к отзыву.
     * @DTA\Data(field="parentId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $parent_id;

    /**
     * Текст комментария.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":4096})
     * @var string|null
     */
    public $text;

}
