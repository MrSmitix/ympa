<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 */
class PriceCompetitivenessThresholdsDTO
{
    /**
     * @DTA\Data(field="optimalPrice", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BasePriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BasePriceDTO::class})
     */
    public ?\App\DTO\BasePriceDTO $optimal_price = null;

    /**
     * @DTA\Data(field="averagePrice", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BasePriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BasePriceDTO::class})
     */
    public ?\App\DTO\BasePriceDTO $average_price = null;

}
