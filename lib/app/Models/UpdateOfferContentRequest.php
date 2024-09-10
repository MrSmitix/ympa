<?php
/**
 * UpdateOfferContentRequest
 */
namespace app\Models;

/**
 * UpdateOfferContentRequest
 * @description Запрос на установку новых значений для параметров.
 */
class UpdateOfferContentRequest {

    /** @var \app\Models\OfferContentDTO[] $offersContent Список товаров с указанными характеристиками.*/
    public $offersContent = [];

}
