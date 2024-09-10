<?php
/**
 * OfferRecommendationInfoDTO
 */
namespace app\Models;

/**
 * OfferRecommendationInfoDTO
 * @description Рекомендации, касающиеся цены на товар.
 */
class OfferRecommendationInfoDTO {

    /** @var string $offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $offerId = "";

    /** @var \app\Models\BasePriceDTO $recommendedCofinancePrice */
    public $recommendedCofinancePrice;

    /** @var \app\Models\PriceCompetitivenessThresholdsDTO $competitivenessThresholds */
    public $competitivenessThresholds;

}
