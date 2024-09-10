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
     * @DTA\Validator(name="Range", options={"min":0, "max":9999})
     */
    public ?int $bid = null;

    /**
     * Доля показов.
     * @DTA\Data(field="showPercent")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":100})
     */
    public ?int $show_percent = null;

}
