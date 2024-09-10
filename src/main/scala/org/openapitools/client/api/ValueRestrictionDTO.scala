package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ValueRestrictionDTO._

case class ValueRestrictionDTO (
  /* Идентификатор ограничивающей характеристики. */
  limitingParameterId: Long,
/* Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики. */
  limitedValues: List[OptionValuesLimitedDTO])

object ValueRestrictionDTO {
  import DateTimeCodecs._

  implicit val ValueRestrictionDTOCodecJson: CodecJson[ValueRestrictionDTO] = CodecJson.derive[ValueRestrictionDTO]
  implicit val ValueRestrictionDTODecoder: EntityDecoder[ValueRestrictionDTO] = jsonOf[ValueRestrictionDTO]
  implicit val ValueRestrictionDTOEncoder: EntityEncoder[ValueRestrictionDTO] = jsonEncoderOf[ValueRestrictionDTO]
}
