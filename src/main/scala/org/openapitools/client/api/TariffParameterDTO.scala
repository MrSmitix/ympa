package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TariffParameterDTO._

case class TariffParameterDTO (
  /* Название параметра. */
  name: String,
/* Значение параметра. */
  value: String)

object TariffParameterDTO {
  import DateTimeCodecs._

  implicit val TariffParameterDTOCodecJson: CodecJson[TariffParameterDTO] = CodecJson.derive[TariffParameterDTO]
  implicit val TariffParameterDTODecoder: EntityDecoder[TariffParameterDTO] = jsonOf[TariffParameterDTO]
  implicit val TariffParameterDTOEncoder: EntityEncoder[TariffParameterDTO] = jsonEncoderOf[TariffParameterDTO]
}
