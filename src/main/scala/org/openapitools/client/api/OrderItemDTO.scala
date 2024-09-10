package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemDTO._

case class OrderItemDTO (
  /* Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  */
  id: Option[Long],
/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: Option[String],
/* Название товара. */
  offerName: Option[String],
/* Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`).  */
  price: Option[BigDecimal],
/* Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  */
  buyerPrice: Option[BigDecimal],
/* Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  */
  buyerPriceBeforeDiscount: Option[BigDecimal],
/* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  */
  priceBeforeDiscount: Option[BigDecimal],
/* Количество единиц товара. */
  count: Option[Integer],
vat: Option[OrderVatType],
/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  shopSku: Option[String],
/* {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  */
  subsidy: Option[BigDecimal],
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  */
  partnerWarehouseId: Option[String],
/* Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. */
  promos: Option[List[OrderItemPromoDTO]],
/* Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует.  */
  instances: Option[List[OrderItemInstanceDTO]],
/* Информация об удалении товара из заказа.  */
  details: Option[List[OrderItemDetailDTO]],
/* Список субсидий по типам. */
  subsidies: Option[List[OrderItemSubsidyDTO]],
/* Список необходимых маркировок товара. */
  requiredInstanceTypes: Option[List[OrderItemInstanceType]])

object OrderItemDTO {
  import DateTimeCodecs._

  implicit val OrderItemDTOCodecJson: CodecJson[OrderItemDTO] = CodecJson.derive[OrderItemDTO]
  implicit val OrderItemDTODecoder: EntityDecoder[OrderItemDTO] = jsonOf[OrderItemDTO]
  implicit val OrderItemDTOEncoder: EntityEncoder[OrderItemDTO] = jsonEncoderOf[OrderItemDTO]
}
