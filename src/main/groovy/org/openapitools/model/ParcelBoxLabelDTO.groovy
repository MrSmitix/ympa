package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ParcelBoxLabelDTO {
    /* Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  */
    String url
    /* Юридическое название магазина. */
    String supplierName
    /* Юридическое название службы доставки. */
    String deliveryServiceName
    /* Идентификатор заказа в системе Маркета. */
    Long orderId
    /* Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина.  */
    String orderNum
    /* Фамилия и инициалы получателя заказа. */
    String recipientName
    /* Идентификатор коробки. */
    Long boxId
    /* Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д.  */
    String fulfilmentId
    /* Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`.  */
    String place
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`.  */
    String weight
    /* Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). */
    String deliveryServiceId
    /* Адрес получателя. */
    String deliveryAddress
    /* Дата отгрузки в формате `dd.MM.yyyy`. */
    String shipmentDate
}
