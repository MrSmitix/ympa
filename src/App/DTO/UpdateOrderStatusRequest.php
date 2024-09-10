<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UpdateOrderStatusRequest
{
    /**
     * @DTA\Data(field="order")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderStatusChangeDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderStatusChangeDTO::class})
     * @var \App\DTO\OrderStatusChangeDTO|null
     */
    public $order;

}
