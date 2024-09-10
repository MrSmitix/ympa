package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConfirmPricesRequest._

case class ConfirmPricesRequest (
  /* Идентификаторы товаров, у которых подтверждается цена. */
  offerIds: List[String])

object ConfirmPricesRequest {
  import DateTimeCodecs._

  implicit val ConfirmPricesRequestCodecJson: CodecJson[ConfirmPricesRequest] = CodecJson.derive[ConfirmPricesRequest]
  implicit val ConfirmPricesRequestDecoder: EntityDecoder[ConfirmPricesRequest] = jsonOf[ConfirmPricesRequest]
  implicit val ConfirmPricesRequestEncoder: EntityEncoder[ConfirmPricesRequest] = jsonEncoderOf[ConfirmPricesRequest]
}
