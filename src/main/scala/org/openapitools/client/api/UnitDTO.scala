package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UnitDTO._

case class UnitDTO (
  /* Идентификатор единицы измерения. */
  id: Long,
/* Сокращенное название единицы измерения. */
  name: String,
/* Полное название единицы измерения. */
  fullName: String)

object UnitDTO {
  import DateTimeCodecs._

  implicit val UnitDTOCodecJson: CodecJson[UnitDTO] = CodecJson.derive[UnitDTO]
  implicit val UnitDTODecoder: EntityDecoder[UnitDTO] = jsonOf[UnitDTO]
  implicit val UnitDTOEncoder: EntityEncoder[UnitDTO] = jsonEncoderOf[UnitDTO]
}
