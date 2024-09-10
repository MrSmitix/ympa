package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OptionValuesLimitedDTO._

case class OptionValuesLimitedDTO (
  /* Идентификатор значения ограничивающей характеристики. */
  limitingOptionValueId: Long,
/* Идентификаторы допустимых значений ограничиваемой характеристики.  */
  optionValueIds: List[Long])

object OptionValuesLimitedDTO {
  import DateTimeCodecs._

  implicit val OptionValuesLimitedDTOCodecJson: CodecJson[OptionValuesLimitedDTO] = CodecJson.derive[OptionValuesLimitedDTO]
  implicit val OptionValuesLimitedDTODecoder: EntityDecoder[OptionValuesLimitedDTO] = jsonOf[OptionValuesLimitedDTO]
  implicit val OptionValuesLimitedDTOEncoder: EntityEncoder[OptionValuesLimitedDTO] = jsonEncoderOf[OptionValuesLimitedDTO]
}
