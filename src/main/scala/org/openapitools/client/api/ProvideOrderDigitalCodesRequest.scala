package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProvideOrderDigitalCodesRequest._

case class ProvideOrderDigitalCodesRequest (
  /* Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же.  */
  items: List[OrderDigitalItemDTO])

object ProvideOrderDigitalCodesRequest {
  import DateTimeCodecs._

  implicit val ProvideOrderDigitalCodesRequestCodecJson: CodecJson[ProvideOrderDigitalCodesRequest] = CodecJson.derive[ProvideOrderDigitalCodesRequest]
  implicit val ProvideOrderDigitalCodesRequestDecoder: EntityDecoder[ProvideOrderDigitalCodesRequest] = jsonOf[ProvideOrderDigitalCodesRequest]
  implicit val ProvideOrderDigitalCodesRequestEncoder: EntityEncoder[ProvideOrderDigitalCodesRequest] = jsonEncoderOf[ProvideOrderDigitalCodesRequest]
}
