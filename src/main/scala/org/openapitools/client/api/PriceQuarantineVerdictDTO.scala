package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PriceQuarantineVerdictDTO._

case class PriceQuarantineVerdictDTO (
  `type`: Option[PriceQuarantineVerdictType],
/* Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. */
  params: List[PriceQuarantineVerdictParameterDTO])

object PriceQuarantineVerdictDTO {
  import DateTimeCodecs._

  implicit val PriceQuarantineVerdictDTOCodecJson: CodecJson[PriceQuarantineVerdictDTO] = CodecJson.derive[PriceQuarantineVerdictDTO]
  implicit val PriceQuarantineVerdictDTODecoder: EntityDecoder[PriceQuarantineVerdictDTO] = jsonOf[PriceQuarantineVerdictDTO]
  implicit val PriceQuarantineVerdictDTOEncoder: EntityEncoder[PriceQuarantineVerdictDTO] = jsonEncoderOf[PriceQuarantineVerdictDTO]
}
