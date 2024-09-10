<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список заказов.
 */
class UpdateOrderStatusesRequest
{
    /**
     * Список заказов.
     * @DTA\Data(field="orders")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection26::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection26::class})
     */
    public ?\App\DTO\Collection26 $orders = null;

}
