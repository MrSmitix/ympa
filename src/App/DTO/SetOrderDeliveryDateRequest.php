<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SetOrderDeliveryDateRequest
{
    /**
     * @DTA\Data(field="dates")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryDateDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryDateDTO::class})
     */
    public ?\App\DTO\OrderDeliveryDateDTO $dates = null;

    /**
     * @DTA\Data(field="reason")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryDateReasonType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryDateReasonType::class})
     */
    public ?\App\DTO\OrderDeliveryDateReasonType $reason = null;

}
