<?php
/**
 * PromoOfferParamsDTO
 */
namespace app\Models;

/**
 * PromoOfferParamsDTO
 * @description Параметры товара в акции.  Возвращается параметр, который соответствует типу акции.
 */
class PromoOfferParamsDTO {

    /** @var \app\Models\PromoOfferDiscountParamsDTO $discountParams */
    public $discountParams;

    /** @var \app\Models\PromoOfferPromocodeParamsDTO $promocodeParams */
    public $promocodeParams;

}
