<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о доставке.
 */
class OrderStatusChangeDeliveryDTO
{
    /**
     * @DTA\Data(field="dates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderStatusChangeDeliveryDatesDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderStatusChangeDeliveryDatesDTO::class})
     * @var \App\DTO\OrderStatusChangeDeliveryDatesDTO|null
     */
    public $dates;

}
