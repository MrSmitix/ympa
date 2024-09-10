<?php
/**
 * UpdateBusinessPricesRequest
 */
namespace app\Models;

/**
 * UpdateBusinessPricesRequest
 * @description Запрос на установку базовых цен на товары.
 */
class UpdateBusinessPricesRequest {

    /** @var \app\Models\UpdateBusinessOfferPriceDTO[] $offers Список товаров с ценами.*/
    public $offers = [];

}
