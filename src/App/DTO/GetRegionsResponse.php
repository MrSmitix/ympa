<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class GetRegionsResponse
{
    /**
     * Регион доставки.
     * @DTA\Data(field="regions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection33::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection33::class})
     */
    public ?\App\DTO\Collection33 $regions = null;

    /**
     * @DTA\Data(field="paging", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ForwardScrollingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ForwardScrollingPagerDTO::class})
     */
    public ?\App\DTO\ForwardScrollingPagerDTO $paging = null;

}
