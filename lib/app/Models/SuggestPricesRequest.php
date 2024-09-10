<?php
/**
 * SuggestPricesRequest
 */
namespace app\Models;

/**
 * SuggestPricesRequest
 * @description Запрос на получение списка цен для продвижения.
 */
class SuggestPricesRequest {

    /** @var \app\Models\SuggestOfferPriceDTO[] $offers Список товаров.*/
    public $offers = [];

}
