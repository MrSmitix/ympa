<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;).
 */
class OrdersStatsItemDTO
{
    /**
     * Название товара.
     * @DTA\Data(field="offerName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $offer_name;

    /**
     * SKU на Маркете.
     * @DTA\Data(field="marketSku", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $market_sku;

    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * @DTA\Data(field="shopSku", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":255})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/"})
     * @var string|null
     */
    public $shop_sku;

    /**
     * Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.
     * @DTA\Data(field="count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $count;

    /**
     * Цена или скидки на товар.
     * @DTA\Data(field="prices", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OrdersStatsPriceDTO[]|null
     */
    public $prices;

    /**
     * @DTA\Data(field="warehouse", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsWarehouseDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsWarehouseDTO::class})
     * @var \App\DTO\OrdersStatsWarehouseDTO|null
     */
    public $warehouse;

    /**
     * Информация об удалении товара из заказа.
     * @DTA\Data(field="details", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OrdersStatsDetailsDTO[]|null
     */
    public $details;

    /**
     * Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
     * @DTA\Data(field="cisList", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $cis_list;

    /**
     * Первоначальное количество единиц товара.
     * @DTA\Data(field="initialCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $initial_count;

    /**
     * Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.
     * @DTA\Data(field="bidFee", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":10000, "inclusive":true})
     * @var int|null
     */
    public $bid_fee;

    /**
     * Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.
     * @DTA\Data(field="cofinanceThreshold", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $cofinance_threshold;

    /**
     * Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.
     * @DTA\Data(field="cofinanceValue", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $cofinance_value;

}
