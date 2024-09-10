<?php
/**
 * OfferPriceByOfferIdsListResponseDTO
 */
namespace app\Models;

/**
 * OfferPriceByOfferIdsListResponseDTO
 * @description Список цен.
 */
class OfferPriceByOfferIdsListResponseDTO {

    /** @var \app\Models\OfferPriceByOfferIdsResponseDTO[] $offers Страница списка цен.*/
    public $offers = [];

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

}
