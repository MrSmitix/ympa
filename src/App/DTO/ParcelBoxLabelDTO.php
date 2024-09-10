<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о ярлыке для коробки.
 */
class ParcelBoxLabelDTO
{
    /**
     * Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

    /**
     * Юридическое название магазина.
     * @DTA\Data(field="supplierName")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $supplier_name = null;

    /**
     * Юридическое название службы доставки.
     * @DTA\Data(field="deliveryServiceName")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $delivery_service_name = null;

    /**
     * Идентификатор заказа в системе Маркета.
     * @DTA\Data(field="orderId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $order_id = null;

    /**
     * Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.
     * @DTA\Data(field="orderNum")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $order_num = null;

    /**
     * Фамилия и инициалы получателя заказа.
     * @DTA\Data(field="recipientName")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $recipient_name = null;

    /**
     * Идентификатор коробки.
     * @DTA\Data(field="boxId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $box_id = null;

    /**
     * Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.
     * @DTA\Data(field="fulfilmentId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $fulfilment_id = null;

    /**
     * Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.
     * @DTA\Data(field="place")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $place = null;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.
     * @DTA\Data(field="weight")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $weight = null;

    /**
     * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
     * @DTA\Data(field="deliveryServiceId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $delivery_service_id = null;

    /**
     * Адрес получателя.
     * @DTA\Data(field="deliveryAddress", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $delivery_address = null;

    /**
     * Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;.
     * @DTA\Data(field="shipmentDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $shipment_date = null;

}
