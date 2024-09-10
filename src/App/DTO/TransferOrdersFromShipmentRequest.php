<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос переноса заказов из отгрузки.
 */
class TransferOrdersFromShipmentRequest
{
    /**
     * Список заказов, которые вы не успеваете подготовить.
     * @DTA\Data(field="orderIds")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection36::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection36::class})
     */
    public ?\App\DTO\Collection36 $order_ids = null;

}
