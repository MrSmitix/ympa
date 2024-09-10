package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePriceWithDiscountDTO._

case class UpdatePriceWithDiscountDTO (
  /* Значение. */
  value: BigDecimal,
currencyId: CurrencyType,
/* Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
  discountBase: Option[BigDecimal])

object UpdatePriceWithDiscountDTO {
  import DateTimeCodecs._

  implicit val UpdatePriceWithDiscountDTOCodecJson: CodecJson[UpdatePriceWithDiscountDTO] = CodecJson.derive[UpdatePriceWithDiscountDTO]
  implicit val UpdatePriceWithDiscountDTODecoder: EntityDecoder[UpdatePriceWithDiscountDTO] = jsonOf[UpdatePriceWithDiscountDTO]
  implicit val UpdatePriceWithDiscountDTOEncoder: EntityEncoder[UpdatePriceWithDiscountDTO] = jsonEncoderOf[UpdatePriceWithDiscountDTO]
}
