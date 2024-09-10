<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Комментарий к отзыву.
 */
class UpdateGoodsFeedbackCommentRequest
{
    /**
     * Идентификатор отзыва.
     * @DTA\Data(field="feedbackId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $feedback_id = null;

    /**
     * @DTA\Data(field="comment")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UpdateGoodsFeedbackCommentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UpdateGoodsFeedbackCommentDTO::class})
     */
    public ?\App\DTO\UpdateGoodsFeedbackCommentDTO $comment = null;

}
