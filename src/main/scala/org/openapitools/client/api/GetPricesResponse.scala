package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPricesResponse._

case class GetPricesResponse (
  status: Option[ApiResponseStatusType],
result: Option[OfferPriceListResponseDTO])

object GetPricesResponse {
  import DateTimeCodecs._

  implicit val GetPricesResponseCodecJson: CodecJson[GetPricesResponse] = CodecJson.derive[GetPricesResponse]
  implicit val GetPricesResponseDecoder: EntityDecoder[GetPricesResponse] = jsonOf[GetPricesResponse]
  implicit val GetPricesResponseEncoder: EntityEncoder[GetPricesResponse] = jsonEncoderOf[GetPricesResponse]
}
