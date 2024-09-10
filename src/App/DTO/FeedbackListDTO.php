<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 */
class FeedbackListDTO
{
    /**
     * @DTA\Data(field="paging", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScrollingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScrollingPagerDTO::class})
     */
    public ?\App\DTO\ScrollingPagerDTO $paging = null;

    /**
     * Список отзывов.  Содержит не более 20 отзывов.
     * @DTA\Data(field="feedbackList")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $feedback_list = null;

}
