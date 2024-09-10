<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список отзывов о товарах.
 */
class GoodsFeedbackListDTO
{
    /**
     * Список отзывов.
     * @DTA\Data(field="feedbacks")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\GoodsFeedbackDTO[]|null
     */
    public $feedbacks;

    /**
     * @DTA\Data(field="paging", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ForwardScrollingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ForwardScrollingPagerDTO::class})
     * @var \App\DTO\ForwardScrollingPagerDTO|null
     */
    public $paging;

}
