<?php
/**
 * OrdersStatsItemDTO
 */
namespace app\Models;

/**
 * OrdersStatsItemDTO
 * @description Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`).
 */
class OrdersStatsItemDTO {

    /** @var string $offerName Название товара.*/
    public $offerName = "";

    /** @var int $marketSku SKU на Маркете.*/
    public $marketSku = 0;

    /** @var string $shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $shopSku = "";

    /** @var int $count Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.*/
    public $count = 0;

    /** @var \app\Models\OrdersStatsPriceDTO[]|null $prices Цена или скидки на товар.*/
    public $prices = null;

    /** @var \app\Models\OrdersStatsWarehouseDTO $warehouse */
    public $warehouse;

    /** @var \app\Models\OrdersStatsDetailsDTO[]|null $details Информация об удалении товара из заказа.*/
    public $details = null;

    /** @var string[]|null $cisList Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).*/
    public $cisList = null;

    /** @var int $initialCount Первоначальное количество единиц товара.*/
    public $initialCount = 0;

    /** @var int $bidFee Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.*/
    public $bidFee = 0;

    /** @var float $cofinanceThreshold Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.*/
    public $cofinanceThreshold = 0;

    /** @var float $cofinanceValue Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.*/
    public $cofinanceValue = 0;

}
