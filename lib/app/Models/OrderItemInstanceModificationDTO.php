<?php
/**
 * OrderItemInstanceModificationDTO
 */
namespace app\Models;

/**
 * OrderItemInstanceModificationDTO
 * @description Позиция в корзине, требующая маркировки.
 */
class OrderItemInstanceModificationDTO {

    /** @var int $id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.*/
    public $id = 0;

    /** @var \app\Models\BriefOrderItemInstanceDTO[] $instances Список кодов маркировки единиц товара.*/
    public $instances = [];

}
