package org.openapitools.server.model


/**
 * Данные для печати ярлыка.
 *
 * @param orderId Идентификатор заказа. for example: ''null''
 * @param placesNumber Количество коробок в заказе. for example: ''null''
 * @param url URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  for example: ''null''
 * @param parcelBoxLabels Информация на ярлыке. for example: ''null''
*/
final case class OrderLabelDTO (
  orderId: Long,
  placesNumber: Int,
  url: String,
  parcelBoxLabels: Seq[ParcelBoxLabelDTO]
)

