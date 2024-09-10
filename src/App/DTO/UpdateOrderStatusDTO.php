<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список заказов.
 */
class UpdateOrderStatusDTO
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
     * @DTA\Data(field="updateStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderUpdateStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderUpdateStatusType::class})
     */
    public ?\App\DTO\OrderUpdateStatusType $update_status = null;

    /**
     * Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.
     * @DTA\Data(field="errorDetails", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $error_details = null;

}
