package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOfferMappingEntriesResponse._

case class GetOfferMappingEntriesResponse (
  status: Option[ApiResponseStatusType],
result: Option[OfferMappingEntriesDTO])

object GetOfferMappingEntriesResponse {
  import DateTimeCodecs._

  implicit val GetOfferMappingEntriesResponseCodecJson: CodecJson[GetOfferMappingEntriesResponse] = CodecJson.derive[GetOfferMappingEntriesResponse]
  implicit val GetOfferMappingEntriesResponseDecoder: EntityDecoder[GetOfferMappingEntriesResponse] = jsonOf[GetOfferMappingEntriesResponse]
  implicit val GetOfferMappingEntriesResponseEncoder: EntityEncoder[GetOfferMappingEntriesResponse] = jsonEncoderOf[GetOfferMappingEntriesResponse]
}
