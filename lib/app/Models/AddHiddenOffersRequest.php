<?php
/**
 * AddHiddenOffersRequest
 */
namespace app\Models;

/**
 * AddHiddenOffersRequest
 * @description Запрос на скрытие оферов.
 */
class AddHiddenOffersRequest {

    /** @var \app\Models\HiddenOfferDTO[] $hiddenOffers Список скрытых товаров.*/
    public $hiddenOffers = [];

}
