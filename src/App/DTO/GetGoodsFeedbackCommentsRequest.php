<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Фильтр запроса комментариев отзыва.
 */
class GetGoodsFeedbackCommentsRequest
{
    /**
     * Идентификатор отзыва.
     * @DTA\Data(field="feedbackId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $feedback_id = null;

}
