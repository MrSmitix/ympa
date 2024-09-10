<?php
/**
 * ParcelBoxLabelDTO
 */
namespace app\Models;

/**
 * ParcelBoxLabelDTO
 * @description Информация о ярлыке для коробки.
 */
class ParcelBoxLabelDTO {

    /** @var string $url Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).*/
    public $url = "";

    /** @var string $supplierName Юридическое название магазина.*/
    public $supplierName = "";

    /** @var string $deliveryServiceName Юридическое название службы доставки.*/
    public $deliveryServiceName = "";

    /** @var int $orderId Идентификатор заказа в системе Маркета.*/
    public $orderId = 0;

    /** @var string $orderNum Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.*/
    public $orderNum = "";

    /** @var string $recipientName Фамилия и инициалы получателя заказа.*/
    public $recipientName = "";

    /** @var int $boxId Идентификатор коробки.*/
    public $boxId = 0;

    /** @var string $fulfilmentId Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.*/
    public $fulfilmentId = "";

    /** @var string $place Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.*/
    public $place = "";

    /** @var string $weight {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.*/
    public $weight = "";

    /** @var string $deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).*/
    public $deliveryServiceId = "";

    /** @var string $deliveryAddress Адрес получателя.*/
    public $deliveryAddress = "";

    /** @var string $shipmentDate Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;.*/
    public $shipmentDate = "";

}
