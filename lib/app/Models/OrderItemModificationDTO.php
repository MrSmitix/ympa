<?php
/**
 * OrderItemModificationDTO
 */
namespace app\Models;

/**
 * OrderItemModificationDTO
 * @description Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.
 */
class OrderItemModificationDTO {

    /** @var int $id Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.*/
    public $id = 0;

    /** @var int $count Новое количество товара.*/
    public $count = 0;

    /** @var \app\Models\BriefOrderItemInstanceDTO[]|null $instances Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).*/
    public $instances = null;

}
