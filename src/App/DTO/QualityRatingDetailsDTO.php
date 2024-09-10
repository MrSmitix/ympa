<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о заказах, которые повлияли на индекс качества.
 */
class QualityRatingDetailsDTO
{
    /**
     * Список заказов, которые повлияли на индекс качества.
     * @DTA\Data(field="affectedOrders")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $affected_orders = null;

}
