<?php
/**
 * OfferPriceListResponseDTO
 */
namespace app\Models;

/**
 * OfferPriceListResponseDTO
 * @description Список цен на товары.
 */
class OfferPriceListResponseDTO {

    /** @var \app\Models\OfferPriceResponseDTO[] $offers Страница списка.*/
    public $offers = [];

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

    /** @var int $total Количество всех цен магазина, измененных через API.*/
    public $total = 0;

}
