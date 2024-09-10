<?php
/**
 * DeleteCampaignOffersDTO
 */
namespace app\Models;

/**
 * DeleteCampaignOffersDTO
 * @description Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 */
class DeleteCampaignOffersDTO {

    /** @var string[]|null $notDeletedOfferIds Список SKU.*/
    public $notDeletedOfferIds = null;

}
