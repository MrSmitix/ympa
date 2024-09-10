<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Заказ.
 */
class OrderStatusChangeDTO
{
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

    /**
     * @DTA\Data(field="delivery", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderStatusChangeDeliveryDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderStatusChangeDeliveryDTO::class})
     * @var \App\DTO\OrderStatusChangeDeliveryDTO|null
     */
    public $delivery;

}
