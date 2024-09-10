<?php
/**
 * UpdateOrderItemRequest
 */
namespace app\Models;

/**
 * UpdateOrderItemRequest
 * @description Запрос на обновление состава заказа.
 */
class UpdateOrderItemRequest {

    /** @var \app\Models\OrderItemModificationDTO[] $items Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.*/
    public $items = [];

    /** @var string $reason */
    public $reason = "";

}
