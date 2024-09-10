<?php
/**
 * GetOrdersStatsResponse
 */
namespace app\Models;

/**
 * GetOrdersStatsResponse
 * @description Ответ на запрос информации по заказам.
 */
class GetOrdersStatsResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\OrdersStatsDTO $result */
    public $result;

}
