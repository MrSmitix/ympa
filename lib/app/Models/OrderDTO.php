<?php
/**
 * OrderDTO
 */
namespace app\Models;

/**
 * OrderDTO
 * @description Заказ.
 */
class OrderDTO {

    /** @var int $id Идентификатор заказа.*/
    public $id = 0;

    /** @var string $status */
    public $status = "";

    /** @var string $substatus */
    public $substatus = "";

    /** @var string $creationDate */
    public $creationDate = "";

    /** @var string $updatedAt */
    public $updatedAt = "";

    /** @var string $currency */
    public $currency = "";

    /** @var float $itemsTotal Платеж покупателя.*/
    public $itemsTotal = 0;

    /** @var float $deliveryTotal Стоимость доставки.*/
    public $deliveryTotal = 0;

    /** @var float $buyerItemsTotal {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.*/
    /** @deprecated */
    public $buyerItemsTotal = 0;

    /** @var float $buyerTotal {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.*/
    /** @deprecated */
    public $buyerTotal = 0;

    /** @var float $buyerItemsTotalBeforeDiscount Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.*/
    public $buyerItemsTotalBeforeDiscount = 0;

    /** @var float $buyerTotalBeforeDiscount {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).*/
    /** @deprecated */
    public $buyerTotalBeforeDiscount = 0;

    /** @var string $paymentType */
    public $paymentType = "";

    /** @var string $paymentMethod */
    public $paymentMethod = "";

    /** @var bool $fake Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.*/
    public $fake = false;

    /** @var \app\Models\OrderItemDTO[] $items Список товаров в заказе.*/
    public $items = [];

    /** @var \app\Models\OrderSubsidyDTO[]|null $subsidies Список субсидий по типам.*/
    public $subsidies = null;

    /** @var \app\Models\OrderDeliveryDTO $delivery */
    public $delivery;

    /** @var \app\Models\OrderBuyerDTO $buyer */
    public $buyer;

    /** @var string $notes Комментарий к заказу.*/
    public $notes = "";

    /** @var string $taxSystem */
    public $taxSystem = "";

    /** @var bool $cancelRequested **Только для модели DBS**  Запрошена ли отмена.*/
    public $cancelRequested = false;

    /** @var string $expiryDate */
    public $expiryDate = "";

}
