<?php
/**
 * UpdateOrderStatusesRequest
 */
namespace app\Models;

/**
 * UpdateOrderStatusesRequest
 * @description Список заказов.
 */
class UpdateOrderStatusesRequest {

    /** @var \app\Models\OrderStateDTO[] $orders Список заказов.*/
    public $orders = [];

}
