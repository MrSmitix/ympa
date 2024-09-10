<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 */
class OrdersShipmentInfoDTO
{
    /**
     * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
     * @DTA\Data(field="orderIdsWithLabels")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var int[]|null
     */
    public $order_ids_with_labels;

    /**
     * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
     * @DTA\Data(field="orderIdsWithoutLabels")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var int[]|null
     */
    public $order_ids_without_labels;

}
