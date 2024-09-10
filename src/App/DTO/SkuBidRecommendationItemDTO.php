<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список товаров с рекомендованными ставками.
 */
class SkuBidRecommendationItemDTO
{
    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * @DTA\Data(field="sku")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1, "max":255})
     * @DTA\Validator(name="Match", options={"pattern":"/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/"})
     */
    public ?string $sku = null;

    /**
     * Значение ставки.
     * @DTA\Data(field="bid")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":9999})
     */
    public ?int $bid = null;

    /**
     * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.
     * @DTA\Data(field="bidRecommendations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $bid_recommendations = null;

    /**
     * Рекомендованные цены.
     * @DTA\Data(field="priceRecommendations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $price_recommendations = null;

}
