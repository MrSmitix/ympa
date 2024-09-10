package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ParcelDTO._

case class ParcelDTO (
  /* Список грузовых мест. Маркет определяет количество мест по длине этого списка. */
  boxes: List[ParcelBoxDTO])

object ParcelDTO {
  import DateTimeCodecs._

  implicit val ParcelDTOCodecJson: CodecJson[ParcelDTO] = CodecJson.derive[ParcelDTO]
  implicit val ParcelDTODecoder: EntityDecoder[ParcelDTO] = jsonOf[ParcelDTO]
  implicit val ParcelDTOEncoder: EntityEncoder[ParcelDTO] = jsonEncoderOf[ParcelDTO]
}
