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
     * @var int|null
     */
    public $feedback_id;

    /**
     * @DTA\Data(field="comment")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UpdateGoodsFeedbackCommentDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UpdateGoodsFeedbackCommentDTO::class})
     * @var \App\DTO\UpdateGoodsFeedbackCommentDTO|null
     */
    public $comment;

}
