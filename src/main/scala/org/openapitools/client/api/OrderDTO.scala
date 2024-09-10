package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderDTO._

case class OrderDTO (
  /* Идентификатор заказа. */
  id: Option[Long],
status: Option[OrderStatusType],
substatus: Option[OrderSubstatusType],
creationDate: Option[String],
updatedAt: Option[String],
currency: Option[CurrencyType],
/* Платеж покупателя.  */
  itemsTotal: Option[BigDecimal],
/* Стоимость доставки.  */
  deliveryTotal: Option[BigDecimal],
/* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  */
  buyerItemsTotal: Option[BigDecimal],
/* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  */
  buyerTotal: Option[BigDecimal],
/* Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  */
  buyerItemsTotalBeforeDiscount: Option[BigDecimal],
/* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).  */
  buyerTotalBeforeDiscount: Option[BigDecimal],
paymentType: Option[OrderPaymentType],
paymentMethod: Option[OrderPaymentMethodType],
/* Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  */
  fake: Option[Boolean],
/* Список товаров в заказе. */
  items: List[OrderItemDTO],
/* Список субсидий по типам. */
  subsidies: Option[List[OrderSubsidyDTO]],
delivery: Option[OrderDeliveryDTO],
buyer: Option[OrderBuyerDTO],
/* Комментарий к заказу. */
  notes: Option[String],
taxSystem: Option[OrderTaxSystemType],
/* **Только для модели DBS**  Запрошена ли отмена.  */
  cancelRequested: Option[Boolean],
expiryDate: Option[String])

object OrderDTO {
  import DateTimeCodecs._

  implicit val OrderDTOCodecJson: CodecJson[OrderDTO] = CodecJson.derive[OrderDTO]
  implicit val OrderDTODecoder: EntityDecoder[OrderDTO] = jsonOf[OrderDTO]
  implicit val OrderDTOEncoder: EntityEncoder[OrderDTO] = jsonEncoderOf[OrderDTO]
}
