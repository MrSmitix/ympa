<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SetOrderDeliveryDateRequest
{
    /**
     * @DTA\Data(field="dates")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryDateDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryDateDTO::class})
     * @var \App\DTO\OrderDeliveryDateDTO|null
     */
    public $dates;

    /**
     * @DTA\Data(field="reason")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryDateReasonType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryDateReasonType::class})
     * @var \App\DTO\OrderDeliveryDateReasonType|null
     */
    public $reason;

}
