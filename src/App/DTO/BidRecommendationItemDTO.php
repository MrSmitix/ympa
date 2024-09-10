<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Рекомендованная ставка и возможная доля показов.
 */
class BidRecommendationItemDTO
{
    /**
     * Значение ставки.
     * @DTA\Data(field="bid")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":9999, "inclusive":true})
     * @var int|null
     */
    public $bid;

    /**
     * Доля показов.
     * @DTA\Data(field="showPercent")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":100, "inclusive":true})
     * @var int|null
     */
    public $show_percent;

}
