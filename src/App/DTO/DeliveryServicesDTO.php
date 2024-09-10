<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о службах доставки.
 */
class DeliveryServicesDTO
{
    /**
     * Информация о службе доставки.
     * @DTA\Data(field="deliveryService")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection72::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection72::class})
     */
    public ?\App\DTO\Collection72 $delivery_service = null;

}
