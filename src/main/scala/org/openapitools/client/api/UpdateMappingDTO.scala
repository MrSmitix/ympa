package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMappingDTO._

case class UpdateMappingDTO (
  /* SKU на Маркете. */
  marketSku: Option[Long])

object UpdateMappingDTO {
  import DateTimeCodecs._

  implicit val UpdateMappingDTOCodecJson: CodecJson[UpdateMappingDTO] = CodecJson.derive[UpdateMappingDTO]
  implicit val UpdateMappingDTODecoder: EntityDecoder[UpdateMappingDTO] = jsonOf[UpdateMappingDTO]
  implicit val UpdateMappingDTOEncoder: EntityEncoder[UpdateMappingDTO] = jsonEncoderOf[UpdateMappingDTO]
}
