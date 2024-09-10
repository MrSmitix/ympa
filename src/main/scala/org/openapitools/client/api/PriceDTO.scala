package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PriceDTO._

case class PriceDTO (
  /* Цена на товар. */
  value: Option[BigDecimal],
/* Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
  discountBase: Option[BigDecimal],
currencyId: Option[CurrencyType],
/* Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  */
  vat: Option[Integer])

object PriceDTO {
  import DateTimeCodecs._

  implicit val PriceDTOCodecJson: CodecJson[PriceDTO] = CodecJson.derive[PriceDTO]
  implicit val PriceDTODecoder: EntityDecoder[PriceDTO] = jsonOf[PriceDTO]
  implicit val PriceDTOEncoder: EntityEncoder[PriceDTO] = jsonEncoderOf[PriceDTO]
}
