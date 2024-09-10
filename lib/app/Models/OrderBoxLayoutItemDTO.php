<?php
/**
 * OrderBoxLayoutItemDTO
 */
namespace app\Models;

/**
 * OrderBoxLayoutItemDTO
 * @description Информация о товаре в коробке.
 */
class OrderBoxLayoutItemDTO {

    /** @var int $id Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}  */
    public $id = 0;

    /** @var int $fullCount Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.*/
    public $fullCount = 0;

    /** @var \app\Models\OrderBoxLayoutPartialCountDTO $partialCount */
    public $partialCount;

    /** @var \app\Models\BriefOrderItemInstanceDTO[]|null $instances Переданные вами коды маркировки.*/
    public $instances = null;

}
