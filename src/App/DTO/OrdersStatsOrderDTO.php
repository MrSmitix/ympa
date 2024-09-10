<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о заказе.
 */
class OrdersStatsOrderDTO
{
    /**
     * Идентификатор заказа.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.
     * @DTA\Data(field="creationDate", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $creation_date;

    /**
     * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).
     * @DTA\Data(field="statusUpdateDate", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $status_update_date;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderStatsStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderStatsStatusType::class})
     * @var \App\DTO\OrderStatsStatusType|null
     */
    public $status;

    /**
     * Идентификатор заказа в информационной системе магазина.
     * @DTA\Data(field="partnerOrderId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $partner_order_id;

    /**
     * @DTA\Data(field="paymentType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsOrderPaymentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsOrderPaymentType::class})
     * @var \App\DTO\OrdersStatsOrderPaymentType|null
     */
    public $payment_type;

    /**
     * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.
     * @DTA\Data(field="fake", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $fake;

    /**
     * @DTA\Data(field="deliveryRegion", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsDeliveryRegionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsDeliveryRegionDTO::class})
     * @var \App\DTO\OrdersStatsDeliveryRegionDTO|null
     */
    public $delivery_region;

    /**
     * Список товаров в заказе после возможных изменений.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OrdersStatsItemDTO[]|null
     */
    public $items;

    /**
     * Список товаров в заказе до изменений.
     * @DTA\Data(field="initialItems", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OrdersStatsItemDTO[]|null
     */
    public $initial_items;

    /**
     * Информация о денежных переводах по заказу.
     * @DTA\Data(field="payments")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OrdersStatsPaymentDTO[]|null
     */
    public $payments;

    /**
     * Информация о комиссиях за заказ.
     * @DTA\Data(field="commissions")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OrdersStatsCommissionDTO[]|null
     */
    public $commissions;

}
