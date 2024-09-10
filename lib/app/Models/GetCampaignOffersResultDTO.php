<?php
/**
 * GetCampaignOffersResultDTO
 */
namespace app\Models;

/**
 * GetCampaignOffersResultDTO
 * @description Список товаров в заданном магазине.
 */
class GetCampaignOffersResultDTO {

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

    /** @var \app\Models\GetCampaignOfferDTO[] $offers Страница списка товаров.*/
    public $offers = [];

}
