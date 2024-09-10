<?php
/**
 * OrderDigitalItemDTO
 */
namespace app\Models;

/**
 * OrderDigitalItemDTO
 * @description Ключ цифрового товара.
 */
class OrderDigitalItemDTO {

    /** @var int $id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.*/
    public $id = 0;

    /** @var string $code Сам ключ.*/
    public $code = "";

    /** @var string $slip Инструкция по активации.*/
    public $slip = "";

    /** @var \DateTime $activateTill Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.*/
    public $activateTill;

}
