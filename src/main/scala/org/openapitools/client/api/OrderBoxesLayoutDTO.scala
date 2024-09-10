package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderBoxesLayoutDTO._

case class OrderBoxesLayoutDTO (
  /* Список коробок. */
  boxes: List[EnrichedOrderBoxLayoutDTO])

object OrderBoxesLayoutDTO {
  import DateTimeCodecs._

  implicit val OrderBoxesLayoutDTOCodecJson: CodecJson[OrderBoxesLayoutDTO] = CodecJson.derive[OrderBoxesLayoutDTO]
  implicit val OrderBoxesLayoutDTODecoder: EntityDecoder[OrderBoxesLayoutDTO] = jsonOf[OrderBoxesLayoutDTO]
  implicit val OrderBoxesLayoutDTOEncoder: EntityEncoder[OrderBoxesLayoutDTO] = jsonEncoderOf[OrderBoxesLayoutDTO]
}
