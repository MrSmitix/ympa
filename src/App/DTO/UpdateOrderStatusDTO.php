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
     * @DTA\Data(field="updateStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderUpdateStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderUpdateStatusType::class})
     * @var \App\DTO\OrderUpdateStatusType|null
     */
    public $update_status;

    /**
     * Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.
     * @DTA\Data(field="errorDetails", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $error_details;

}
