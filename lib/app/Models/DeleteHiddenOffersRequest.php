<?php
/**
 * DeleteHiddenOffersRequest
 */
namespace app\Models;

/**
 * DeleteHiddenOffersRequest
 * @description Запрос на возобновление показа оферов.
 */
class DeleteHiddenOffersRequest {

    /** @var \app\Models\HiddenOfferDTO[] $hiddenOffers Список скрытых товаров.*/
    public $hiddenOffers = [];

}
