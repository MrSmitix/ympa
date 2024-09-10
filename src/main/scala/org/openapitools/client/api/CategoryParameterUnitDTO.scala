package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CategoryParameterUnitDTO._

case class CategoryParameterUnitDTO (
  /* Единица измерения по умолчанию. */
  defaultUnitId: Long,
/* Допустимые единицы измерения. */
  units: List[UnitDTO])

object CategoryParameterUnitDTO {
  import DateTimeCodecs._

  implicit val CategoryParameterUnitDTOCodecJson: CodecJson[CategoryParameterUnitDTO] = CodecJson.derive[CategoryParameterUnitDTO]
  implicit val CategoryParameterUnitDTODecoder: EntityDecoder[CategoryParameterUnitDTO] = jsonOf[CategoryParameterUnitDTO]
  implicit val CategoryParameterUnitDTOEncoder: EntityEncoder[CategoryParameterUnitDTO] = jsonEncoderOf[CategoryParameterUnitDTO]
}
