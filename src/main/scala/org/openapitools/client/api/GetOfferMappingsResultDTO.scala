package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOfferMappingsResultDTO._

case class GetOfferMappingsResultDTO (
  paging: Option[ScrollingPagerDTO],
/* Информация о товарах. */
  offerMappings: List[GetOfferMappingDTO])

object GetOfferMappingsResultDTO {
  import DateTimeCodecs._

  implicit val GetOfferMappingsResultDTOCodecJson: CodecJson[GetOfferMappingsResultDTO] = CodecJson.derive[GetOfferMappingsResultDTO]
  implicit val GetOfferMappingsResultDTODecoder: EntityDecoder[GetOfferMappingsResultDTO] = jsonOf[GetOfferMappingsResultDTO]
  implicit val GetOfferMappingsResultDTOEncoder: EntityEncoder[GetOfferMappingsResultDTO] = jsonEncoderOf[GetOfferMappingsResultDTO]
}
