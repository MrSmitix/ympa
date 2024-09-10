<?php
/**
 * UpdateCampaignOffersRequest
 */
namespace app\Models;

/**
 * UpdateCampaignOffersRequest
 * @description Запрос на обновление предложений товаров магазина.
 */
class UpdateCampaignOffersRequest {

    /** @var \app\Models\UpdateCampaignOfferDTO[] $offers Параметры размещения товаров в заданном магазине.*/
    public $offers = [];

}
