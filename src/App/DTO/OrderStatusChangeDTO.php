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
     */
    public ?\App\DTO\OrderStatusType $status = null;

    /**
     * @DTA\Data(field="substatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderSubstatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderSubstatusType::class})
     */
    public ?\App\DTO\OrderSubstatusType $substatus = null;

    /**
     * @DTA\Data(field="delivery", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderStatusChangeDeliveryDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderStatusChangeDeliveryDTO::class})
     */
    public ?\App\DTO\OrderStatusChangeDeliveryDTO $delivery = null;

}
