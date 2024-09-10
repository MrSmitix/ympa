<?php
/**
 * OrdersShipmentInfoDTO
 */
namespace app\Models;

/**
 * OrdersShipmentInfoDTO
 * @description Годные/негодные ярлыки по заказам в отгрузке.
 */
class OrdersShipmentInfoDTO {

    /** @var int[] $orderIdsWithLabels Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.*/
    public $orderIdsWithLabels = [];

    /** @var int[] $orderIdsWithoutLabels Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.*/
    public $orderIdsWithoutLabels = [];

}
