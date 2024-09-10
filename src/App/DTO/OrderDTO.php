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
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderStatusType::class})
     */
    public ?\App\DTO\OrderStatusType $status = null;

    /**
     * @DTA\Data(field="substatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderSubstatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderSubstatusType::class})
     */
    public ?\App\DTO\OrderSubstatusType $substatus = null;

    /**
     * @DTA\Data(field="creationDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $creation_date = null;

    /**
     * @DTA\Data(field="updatedAt", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $updated_at = null;

    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CurrencyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CurrencyType::class})
     */
    public ?\App\DTO\CurrencyType $currency = null;

    /**
     * Платеж покупателя.
     * @DTA\Data(field="itemsTotal", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $items_total = null;

    /**
     * Стоимость доставки.
     * @DTA\Data(field="deliveryTotal", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $delivery_total = null;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.
     * @DTA\Data(field="buyerItemsTotal", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $buyer_items_total = null;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.
     * @DTA\Data(field="buyerTotal", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $buyer_total = null;

    /**
     * Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.
     * @DTA\Data(field="buyerItemsTotalBeforeDiscount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $buyer_items_total_before_discount = null;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).
     * @DTA\Data(field="buyerTotalBeforeDiscount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $buyer_total_before_discount = null;

    /**
     * @DTA\Data(field="paymentType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderPaymentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderPaymentType::class})
     */
    public ?\App\DTO\OrderPaymentType $payment_type = null;

    /**
     * @DTA\Data(field="paymentMethod", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderPaymentMethodType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderPaymentMethodType::class})
     */
    public ?\App\DTO\OrderPaymentMethodType $payment_method = null;

    /**
     * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.
     * @DTA\Data(field="fake", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $fake = null;

    /**
     * Список товаров в заказе.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection12::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection12::class})
     */
    public ?\App\DTO\Collection12 $items = null;

    /**
     * Список субсидий по типам.
     * @DTA\Data(field="subsidies", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection13::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection13::class})
     */
    public ?\App\DTO\Collection13 $subsidies = null;

    /**
     * @DTA\Data(field="delivery", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryDTO::class})
     */
    public ?\App\DTO\OrderDeliveryDTO $delivery = null;

    /**
     * @DTA\Data(field="buyer", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderBuyerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderBuyerDTO::class})
     */
    public ?\App\DTO\OrderBuyerDTO $buyer = null;

    /**
     * Комментарий к заказу.
     * @DTA\Data(field="notes", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $notes = null;

    /**
     * @DTA\Data(field="taxSystem", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderTaxSystemType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderTaxSystemType::class})
     */
    public ?\App\DTO\OrderTaxSystemType $tax_system = null;

    /**
     * **Только для модели DBS**  Запрошена ли отмена.
     * @DTA\Data(field="cancelRequested", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $cancel_requested = null;

    /**
     * @DTA\Data(field="expiryDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $expiry_date = null;

}
