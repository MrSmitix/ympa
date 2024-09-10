<?php
/**
 * GetOrdersResponse
 */
namespace app\Models;

/**
 * GetOrdersResponse
 * @description Модель для ответа API списка информации по заказам.
 */
class GetOrdersResponse {

    /** @var \app\Models\FlippingPagerDTO $pager */
    public $pager;

    /** @var \app\Models\OrderDTO[] $orders Модель заказа.*/
    public $orders = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
