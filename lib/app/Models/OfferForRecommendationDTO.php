<?php
/**
 * OfferForRecommendationDTO
 */
namespace app\Models;

/**
 * OfferForRecommendationDTO
 * @description Информация о состоянии цены на товар.
 */
class OfferForRecommendationDTO {

    /** @var string $offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $offerId = "";

    /** @var \app\Models\BasePriceDTO $price */
    public $price;

    /** @var \app\Models\GetPriceDTO $cofinancePrice */
    public $cofinancePrice;

    /** @var string $competitiveness */
    public $competitiveness = "";

    /** @var int $shows Количество показов карточки товара за последние 7 дней.*/
    public $shows = 0;

}
