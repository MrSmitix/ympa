package org.openapitools.server.model


/**
 * Информация о ярлыке для коробки.
 *
 * @param url Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  for example: ''null''
 * @param supplierName Юридическое название магазина. for example: ''null''
 * @param deliveryServiceName Юридическое название службы доставки. for example: ''null''
 * @param orderId Идентификатор заказа в системе Маркета. for example: ''null''
 * @param orderNum Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина.  for example: ''null''
 * @param recipientName Фамилия и инициалы получателя заказа. for example: ''null''
 * @param boxId Идентификатор коробки. for example: ''null''
 * @param fulfilmentId Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д.  for example: ''null''
 * @param place Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`.  for example: ''null''
 * @param weight {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`.  for example: ''null''
 * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). for example: ''null''
 * @param deliveryAddress Адрес получателя. for example: ''null''
 * @param shipmentDate Дата отгрузки в формате `dd.MM.yyyy`. for example: ''null''
*/
final case class ParcelBoxLabelDTO (
  url: String,
  supplierName: String,
  deliveryServiceName: String,
  orderId: Long,
  orderNum: String,
  recipientName: String,
  boxId: Long,
  fulfilmentId: String,
  place: String,
  weight: String,
  deliveryServiceId: String,
  deliveryAddress: Option[String] = None,
  shipmentDate: Option[String] = None
)

