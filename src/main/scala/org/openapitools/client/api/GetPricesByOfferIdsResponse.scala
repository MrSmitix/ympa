package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPricesByOfferIdsResponse._

case class GetPricesByOfferIdsResponse (
  status: Option[ApiResponseStatusType],
result: Option[OfferPriceByOfferIdsListResponseDTO])

object GetPricesByOfferIdsResponse {
  import DateTimeCodecs._

  implicit val GetPricesByOfferIdsResponseCodecJson: CodecJson[GetPricesByOfferIdsResponse] = CodecJson.derive[GetPricesByOfferIdsResponse]
  implicit val GetPricesByOfferIdsResponseDecoder: EntityDecoder[GetPricesByOfferIdsResponse] = jsonOf[GetPricesByOfferIdsResponse]
  implicit val GetPricesByOfferIdsResponseEncoder: EntityEncoder[GetPricesByOfferIdsResponse] = jsonEncoderOf[GetPricesByOfferIdsResponse]
}
