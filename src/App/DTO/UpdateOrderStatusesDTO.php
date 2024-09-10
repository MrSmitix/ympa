<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список заказов, статус которых обновился.
 */
class UpdateOrderStatusesDTO
{
    /**
     * Список с обновленными заказами.
     * @DTA\Data(field="orders")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $orders = null;

}
