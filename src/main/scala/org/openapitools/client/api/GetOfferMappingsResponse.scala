package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOfferMappingsResponse._

case class GetOfferMappingsResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetOfferMappingsResultDTO])

object GetOfferMappingsResponse {
  import DateTimeCodecs._

  implicit val GetOfferMappingsResponseCodecJson: CodecJson[GetOfferMappingsResponse] = CodecJson.derive[GetOfferMappingsResponse]
  implicit val GetOfferMappingsResponseDecoder: EntityDecoder[GetOfferMappingsResponse] = jsonOf[GetOfferMappingsResponse]
  implicit val GetOfferMappingsResponseEncoder: EntityEncoder[GetOfferMappingsResponse] = jsonEncoderOf[GetOfferMappingsResponse]
}
