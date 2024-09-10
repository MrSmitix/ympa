package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetSuggestedOfferMappingsResponse._

case class GetSuggestedOfferMappingsResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetSuggestedOfferMappingsResultDTO])

object GetSuggestedOfferMappingsResponse {
  import DateTimeCodecs._

  implicit val GetSuggestedOfferMappingsResponseCodecJson: CodecJson[GetSuggestedOfferMappingsResponse] = CodecJson.derive[GetSuggestedOfferMappingsResponse]
  implicit val GetSuggestedOfferMappingsResponseDecoder: EntityDecoder[GetSuggestedOfferMappingsResponse] = jsonOf[GetSuggestedOfferMappingsResponse]
  implicit val GetSuggestedOfferMappingsResponseEncoder: EntityEncoder[GetSuggestedOfferMappingsResponse] = jsonEncoderOf[GetSuggestedOfferMappingsResponse]
}
