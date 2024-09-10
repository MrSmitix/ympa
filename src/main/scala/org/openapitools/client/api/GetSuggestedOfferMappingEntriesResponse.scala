package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetSuggestedOfferMappingEntriesResponse._

case class GetSuggestedOfferMappingEntriesResponse (
  status: Option[ApiResponseStatusType],
result: Option[OfferMappingSuggestionsListDTO])

object GetSuggestedOfferMappingEntriesResponse {
  import DateTimeCodecs._

  implicit val GetSuggestedOfferMappingEntriesResponseCodecJson: CodecJson[GetSuggestedOfferMappingEntriesResponse] = CodecJson.derive[GetSuggestedOfferMappingEntriesResponse]
  implicit val GetSuggestedOfferMappingEntriesResponseDecoder: EntityDecoder[GetSuggestedOfferMappingEntriesResponse] = jsonOf[GetSuggestedOfferMappingEntriesResponse]
  implicit val GetSuggestedOfferMappingEntriesResponseEncoder: EntityEncoder[GetSuggestedOfferMappingEntriesResponse] = jsonEncoderOf[GetSuggestedOfferMappingEntriesResponse]
}
