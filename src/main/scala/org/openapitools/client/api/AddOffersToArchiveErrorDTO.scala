package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AddOffersToArchiveErrorDTO._

case class AddOffersToArchiveErrorDTO (
  /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: String,
error: AddOffersToArchiveErrorType)

object AddOffersToArchiveErrorDTO {
  import DateTimeCodecs._

  implicit val AddOffersToArchiveErrorDTOCodecJson: CodecJson[AddOffersToArchiveErrorDTO] = CodecJson.derive[AddOffersToArchiveErrorDTO]
  implicit val AddOffersToArchiveErrorDTODecoder: EntityDecoder[AddOffersToArchiveErrorDTO] = jsonOf[AddOffersToArchiveErrorDTO]
  implicit val AddOffersToArchiveErrorDTOEncoder: EntityEncoder[AddOffersToArchiveErrorDTO] = jsonEncoderOf[AddOffersToArchiveErrorDTO]
}
