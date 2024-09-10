<?php
/**
 * UpdatePromoOfferDiscountParamsDTO
 */
namespace app\Models;

/**
 * UpdatePromoOfferDiscountParamsDTO
 * @description Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами.
 */
class UpdatePromoOfferDiscountParamsDTO {

    /** @var int $price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.*/
    public $price = 0;

    /** @var int $promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.*/
    public $promoPrice = 0;

}
