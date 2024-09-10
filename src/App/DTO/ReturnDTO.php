<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Возврат заказа.
 */
class ReturnDTO
{
    /**
     * Идентификатор возврата.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Номер заказа.
     * @DTA\Data(field="orderId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $order_id;

    /**
     * Дата создания возврата клиентом.
     * @DTA\Data(field="creationDate", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $creation_date;

    /**
     * Дата обновления возврата.
     * @DTA\Data(field="updateDate", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $update_date;

    /**
     * @DTA\Data(field="refundStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RefundStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RefundStatusType::class})
     * @var \App\DTO\RefundStatusType|null
     */
    public $refund_status;

    /**
     * @DTA\Data(field="logisticPickupPoint", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LogisticPickupPointDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LogisticPickupPointDTO::class})
     * @var \App\DTO\LogisticPickupPointDTO|null
     */
    public $logistic_pickup_point;

    /**
     * @DTA\Data(field="shipmentRecipientType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RecipientType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RecipientType::class})
     * @var \App\DTO\RecipientType|null
     */
    public $shipment_recipient_type;

    /**
     * @DTA\Data(field="shipmentStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnShipmentStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnShipmentStatusType::class})
     * @var \App\DTO\ReturnShipmentStatusType|null
     */
    public $shipment_status;

    /**
     * Сумма возврата.
     * @DTA\Data(field="refundAmount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $refund_amount;

    /**
     * Список товаров в возврате.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ReturnItemDTO[]|null
     */
    public $items;

    /**
     * @DTA\Data(field="returnType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnType::class})
     * @var \App\DTO\ReturnType|null
     */
    public $return_type;

    /**
     * Используется ли опция **Быстрый возврат денег за дешевый брак**.
     * @DTA\Data(field="fastReturn", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $fast_return;

}
