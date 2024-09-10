package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromosResultDTO._

case class GetPromosResultDTO (
  /* Акции Маркета. */
  promos: List[GetPromoDTO])

object GetPromosResultDTO {
  import DateTimeCodecs._

  implicit val GetPromosResultDTOCodecJson: CodecJson[GetPromosResultDTO] = CodecJson.derive[GetPromosResultDTO]
  implicit val GetPromosResultDTODecoder: EntityDecoder[GetPromosResultDTO] = jsonOf[GetPromosResultDTO]
  implicit val GetPromosResultDTOEncoder: EntityEncoder[GetPromosResultDTO] = jsonEncoderOf[GetPromosResultDTO]
}
