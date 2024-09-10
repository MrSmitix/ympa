<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список цен.
 */
class OfferPriceByOfferIdsListResponseDTO
{
    /**
     * Страница списка цен.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OfferPriceByOfferIdsResponseDTO[]|null
     */
    public $offers;

    /**
     * @DTA\Data(field="paging", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScrollingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScrollingPagerDTO::class})
     * @var \App\DTO\ScrollingPagerDTO|null
     */
    public $paging;

}
