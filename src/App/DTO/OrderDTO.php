<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Заказ.
 */
class OrderDTO
{
    /**
     * Идентификатор заказа.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderStatusType::class})
     * @var \App\DTO\OrderStatusType|null
     */
    public $status;

    /**
     * @DTA\Data(field="substatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderSubstatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderSubstatusType::class})
     * @var \App\DTO\OrderSubstatusType|null
     */
    public $substatus;

    /**
     * @DTA\Data(field="creationDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $creation_date;

    /**
     * @DTA\Data(field="updatedAt", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $updated_at;

    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CurrencyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CurrencyType::class})
     * @var \App\DTO\CurrencyType|null
     */
    public $currency;

    /**
     * Платеж покупателя.
     * @DTA\Data(field="itemsTotal", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $items_total;

    /**
     * Стоимость доставки.
     * @DTA\Data(field="deliveryTotal", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $delivery_total;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.
     * @DTA\Data(field="buyerItemsTotal", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $buyer_items_total;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.
     * @DTA\Data(field="buyerTotal", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $buyer_total;

    /**
     * Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.
     * @DTA\Data(field="buyerItemsTotalBeforeDiscount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $buyer_items_total_before_discount;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).
     * @DTA\Data(field="buyerTotalBeforeDiscount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $buyer_total_before_discount;

    /**
     * @DTA\Data(field="paymentType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderPaymentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderPaymentType::class})
     * @var \App\DTO\OrderPaymentType|null
     */
    public $payment_type;

    /**
     * @DTA\Data(field="paymentMethod", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderPaymentMethodType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderPaymentMethodType::class})
     * @var \App\DTO\OrderPaymentMethodType|null
     */
    public $payment_method;

    /**
     * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.
     * @DTA\Data(field="fake", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $fake;

    /**
     * Список товаров в заказе.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection12::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection12::class})
     * @var \App\DTO\Collection12|null
     */
    public $items;

    /**
     * Список субсидий по типам.
     * @DTA\Data(field="subsidies", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection13::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection13::class})
     * @var \App\DTO\Collection13|null
     */
    public $subsidies;

    /**
     * @DTA\Data(field="delivery", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryDTO::class})
     * @var \App\DTO\OrderDeliveryDTO|null
     */
    public $delivery;

    /**
     * @DTA\Data(field="buyer", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderBuyerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderBuyerDTO::class})
     * @var \App\DTO\OrderBuyerDTO|null
     */
    public $buyer;

    /**
     * Комментарий к заказу.
     * @DTA\Data(field="notes", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $notes;

    /**
     * @DTA\Data(field="taxSystem", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderTaxSystemType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderTaxSystemType::class})
     * @var \App\DTO\OrderTaxSystemType|null
     */
    public $tax_system;

    /**
     * **Только для модели DBS**  Запрошена ли отмена.
     * @DTA\Data(field="cancelRequested", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $cancel_requested;

    /**
     * @DTA\Data(field="expiryDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $expiry_date;

}
