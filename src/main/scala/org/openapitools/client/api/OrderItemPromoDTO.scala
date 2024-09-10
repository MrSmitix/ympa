package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemPromoDTO._

case class OrderItemPromoDTO (
  `type`: OrderPromoType,
/* Размер пользовательской скидки в валюте покупателя.  */
  discount: Option[BigDecimal],
/* Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  */
  subsidy: Option[BigDecimal],
/* Идентификатор акции поставщика.  */
  shopPromoId: Option[String],
/* Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`.  */
  marketPromoId: Option[String])

object OrderItemPromoDTO {
  import DateTimeCodecs._

  implicit val OrderItemPromoDTOCodecJson: CodecJson[OrderItemPromoDTO] = CodecJson.derive[OrderItemPromoDTO]
  implicit val OrderItemPromoDTODecoder: EntityDecoder[OrderItemPromoDTO] = jsonOf[OrderItemPromoDTO]
  implicit val OrderItemPromoDTOEncoder: EntityEncoder[OrderItemPromoDTO] = jsonEncoderOf[OrderItemPromoDTO]
}
