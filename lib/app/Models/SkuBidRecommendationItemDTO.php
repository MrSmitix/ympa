<?php
/**
 * SkuBidRecommendationItemDTO
 */
namespace app\Models;

/**
 * SkuBidRecommendationItemDTO
 * @description Список товаров с рекомендованными ставками.
 */
class SkuBidRecommendationItemDTO {

    /** @var string $sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $sku = "";

    /** @var int $bid Значение ставки.*/
    public $bid = 0;

    /** @var \app\Models\BidRecommendationItemDTO[]|null $bidRecommendations Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.*/
    public $bidRecommendations = null;

    /** @var \app\Models\PriceRecommendationItemDTO[]|null $priceRecommendations Рекомендованные цены.*/
    public $priceRecommendations = null;

}
