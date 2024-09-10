<?php
/**
 * PromoOfferDiscountParamsDTO
 */
namespace app\Models;

/**
 * PromoOfferDiscountParamsDTO
 * @description Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
 */
class PromoOfferDiscountParamsDTO {

    /** @var int $price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.*/
    public $price = 0;

    /** @var int $promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.*/
    public $promoPrice = 0;

    /** @var int $maxPromoPrice Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.*/
    public $maxPromoPrice = 0;

}
