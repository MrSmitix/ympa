<?php
/**
 * OrdersStatsDTO
 */
namespace app\Models;

/**
 * OrdersStatsDTO
 * @description Информация по заказам.
 */
class OrdersStatsDTO {

    /** @var \app\Models\OrdersStatsOrderDTO[] $orders Список заказов.*/
    public $orders = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
