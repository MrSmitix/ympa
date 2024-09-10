<?php
/**
 * PromoOfferPromocodeParamsDTO
 */
namespace app\Models;

/**
 * PromoOfferPromocodeParamsDTO
 * @description Параметры товара в акции с типом `MARKET_PROMOCODE`.
 */
class PromoOfferPromocodeParamsDTO {

    /** @var int $maxPrice Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров.*/
    public $maxPrice = 0;

}
