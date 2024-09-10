<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация по заказу.
 */
class OrderStateDTO
{
    /**
     * Идентификатор заказа.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="status")
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

}
