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
     */
    public ?int $id = null;

    /**
     * Номер заказа.
     * @DTA\Data(field="orderId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $order_id = null;

    /**
     * Дата создания возврата клиентом.
     * @DTA\Data(field="creationDate", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $creation_date = null;

    /**
     * Дата обновления возврата.
     * @DTA\Data(field="updateDate", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $update_date = null;

    /**
     * @DTA\Data(field="refundStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RefundStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RefundStatusType::class})
     */
    public ?\App\DTO\RefundStatusType $refund_status = null;

    /**
     * @DTA\Data(field="logisticPickupPoint", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LogisticPickupPointDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LogisticPickupPointDTO::class})
     */
    public ?\App\DTO\LogisticPickupPointDTO $logistic_pickup_point = null;

    /**
     * @DTA\Data(field="shipmentRecipientType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RecipientType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RecipientType::class})
     */
    public ?\App\DTO\RecipientType $shipment_recipient_type = null;

    /**
     * @DTA\Data(field="shipmentStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnShipmentStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnShipmentStatusType::class})
     */
    public ?\App\DTO\ReturnShipmentStatusType $shipment_status = null;

    /**
     * Сумма возврата.
     * @DTA\Data(field="refundAmount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $refund_amount = null;

    /**
     * Список товаров в возврате.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $items = null;

    /**
     * @DTA\Data(field="returnType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnType::class})
     */
    public ?\App\DTO\ReturnType $return_type = null;

    /**
     * Используется ли опция **Быстрый возврат денег за дешевый брак**.
     * @DTA\Data(field="fastReturn", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $fast_return = null;

}
