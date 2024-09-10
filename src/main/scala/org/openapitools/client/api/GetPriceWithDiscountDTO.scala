package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import GetPriceWithDiscountDTO._

case class GetPriceWithDiscountDTO (
  /* Значение. */
  value: BigDecimal,
currencyId: CurrencyType,
/* Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
  discountBase: Option[BigDecimal],
/* Время последнего обновления. */
  updatedAt: OffsetDateTime)

object GetPriceWithDiscountDTO {
  import DateTimeCodecs._

  implicit val GetPriceWithDiscountDTOCodecJson: CodecJson[GetPriceWithDiscountDTO] = CodecJson.derive[GetPriceWithDiscountDTO]
  implicit val GetPriceWithDiscountDTODecoder: EntityDecoder[GetPriceWithDiscountDTO] = jsonOf[GetPriceWithDiscountDTO]
  implicit val GetPriceWithDiscountDTOEncoder: EntityEncoder[GetPriceWithDiscountDTO] = jsonEncoderOf[GetPriceWithDiscountDTO]
}
