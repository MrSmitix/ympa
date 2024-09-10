<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Идентификаторы отзывов.
 */
class SkipGoodsFeedbackReactionRequest
{
    /**
     * Список идентификаторов отзывов, на которые магазин не будет отвечать.
     * @DTA\Data(field="feedbackIds")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection95::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection95::class})
     * @var \App\DTO\Collection95|null
     */
    public $feedback_ids;

}
