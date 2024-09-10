<?php
/**
 * UpdatePricesRequest
 */
namespace app\Models;

/**
 * UpdatePricesRequest
 * @description Запрос на установку цен на товары.
 */
class UpdatePricesRequest {

    /** @var \app\Models\OfferPriceDTO[] $offers Список товаров.*/
    public $offers = [];

}
