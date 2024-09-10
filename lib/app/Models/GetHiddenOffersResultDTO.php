<?php
/**
 * GetHiddenOffersResultDTO
 */
namespace app\Models;

/**
 * GetHiddenOffersResultDTO
 * @description Список скрытых вами товаров.
 */
class GetHiddenOffersResultDTO {

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

    /** @var \app\Models\HiddenOfferDTO[] $hiddenOffers Список скрытых товаров.*/
    public $hiddenOffers = [];

}
