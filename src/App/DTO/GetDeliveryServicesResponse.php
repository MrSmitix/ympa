<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ответ на запрос списка служб доставки.
 */
class GetDeliveryServicesResponse
{
    /**
     * @DTA\Data(field="result", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DeliveryServicesDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DeliveryServicesDTO::class})
     */
    public ?\App\DTO\DeliveryServicesDTO $result = null;

}
