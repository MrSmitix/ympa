package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ParameterValueDTO._

case class ParameterValueDTO (
  /* Идентификатор характеристики. */
  parameterId: Long,
/* Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию. */
  unitId: Option[Long],
/* Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`.  */
  valueId: Option[Long],
/* Значение. */
  value: Option[String])

object ParameterValueDTO {
  import DateTimeCodecs._

  implicit val ParameterValueDTOCodecJson: CodecJson[ParameterValueDTO] = CodecJson.derive[ParameterValueDTO]
  implicit val ParameterValueDTODecoder: EntityDecoder[ParameterValueDTO] = jsonOf[ParameterValueDTO]
  implicit val ParameterValueDTOEncoder: EntityEncoder[ParameterValueDTO] = jsonEncoderOf[ParameterValueDTO]
}
