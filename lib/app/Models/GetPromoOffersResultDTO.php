<?php
/**
 * GetPromoOffersResultDTO
 */
namespace app\Models;

/**
 * GetPromoOffersResultDTO
 * @description Список товаров, которые участвуют или могут участвовать в акции.
 */
class GetPromoOffersResultDTO {

    /** @var \app\Models\GetPromoOfferDTO[] $offers Товары, которые участвуют или могут участвовать в акции.*/
    public $offers = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
