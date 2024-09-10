<?php
/**
 * GetOffersResponse
 */
namespace app\Models;

/**
 * GetOffersResponse
 * @description Список предложений с пагинатором.
 */
class GetOffersResponse {

    /** @var \app\Models\OfferDTO[] $offers Список предложений магазина.*/
    public $offers = [];

    /** @var \app\Models\FlippingPagerDTO $pager */
    public $pager;

}
