package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOfferMappingsResponse._

case class UpdateOfferMappingsResponse (
  status: Option[ApiResponseStatusType],
/* Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  */
  results: Option[List[UpdateOfferMappingResultDTO]])

object UpdateOfferMappingsResponse {
  import DateTimeCodecs._

  implicit val UpdateOfferMappingsResponseCodecJson: CodecJson[UpdateOfferMappingsResponse] = CodecJson.derive[UpdateOfferMappingsResponse]
  implicit val UpdateOfferMappingsResponseDecoder: EntityDecoder[UpdateOfferMappingsResponse] = jsonOf[UpdateOfferMappingsResponse]
  implicit val UpdateOfferMappingsResponseEncoder: EntityEncoder[UpdateOfferMappingsResponse] = jsonEncoderOf[UpdateOfferMappingsResponse]
}
