<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class GetRegionWithChildrenResponse
{
    /**
     * @DTA\Data(field="pager", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FlippingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FlippingPagerDTO::class})
     * @var \App\DTO\FlippingPagerDTO|null
     */
    public $pager;

    /**
     * @DTA\Data(field="regions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionDTO::class})
     * @var \App\DTO\RegionDTO|null
     */
    public $regions;

}
