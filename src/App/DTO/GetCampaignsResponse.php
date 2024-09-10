<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Результаты поиска магазинов.
 */
class GetCampaignsResponse
{
    /**
     * Список с информацией по каждому магазину.
     * @DTA\Data(field="campaigns")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection::class})
     * @var \App\DTO\Collection|null
     */
    public $campaigns;

    /**
     * @DTA\Data(field="pager", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FlippingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FlippingPagerDTO::class})
     * @var \App\DTO\FlippingPagerDTO|null
     */
    public $pager;

}
