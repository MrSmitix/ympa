<?php
/**
 * DeleteCampaignOffersRequest
 */
namespace app\Models;

/**
 * DeleteCampaignOffersRequest
 * @description Фильтрации удаляемых товаров по offerIds.
 */
class DeleteCampaignOffersRequest {

    /** @var string[] $offerIds Идентификаторы товаров в каталоге.*/
    public $offerIds = [];

}
