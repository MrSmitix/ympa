<?php
/**
 * UpdateOrderStatusesDTO
 */
namespace app\Models;

/**
 * UpdateOrderStatusesDTO
 * @description Список заказов, статус которых обновился.
 */
class UpdateOrderStatusesDTO {

    /** @var \app\Models\UpdateOrderStatusDTO[] $orders Список с обновленными заказами.*/
    public $orders = [];

}
