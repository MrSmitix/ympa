<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о товаре в коробке.
 */
class OrderBoxLayoutItemDTO
{
    /**
     * Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}  
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.
     * @DTA\Data(field="fullCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @var int|null
     */
    public $full_count;

    /**
     * @DTA\Data(field="partialCount", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderBoxLayoutPartialCountDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderBoxLayoutPartialCountDTO::class})
     * @var \App\DTO\OrderBoxLayoutPartialCountDTO|null
     */
    public $partial_count;

    /**
     * Переданные вами коды маркировки.
     * @DTA\Data(field="instances", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection28::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection28::class})
     * @var \App\DTO\Collection28|null
     */
    public $instances;

}