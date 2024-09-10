<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список товаров с указанными ставками.
 */
class GetBidsInfoResponseDTO
{
    /**
     * Страница списка товаров.
     * @DTA\Data(field="bids")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\SkuBidItemDTO[]|null
     */
    public $bids;

    /**
     * @DTA\Data(field="paging", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ForwardScrollingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ForwardScrollingPagerDTO::class})
     * @var \App\DTO\ForwardScrollingPagerDTO|null
     */
    public $paging;

}
