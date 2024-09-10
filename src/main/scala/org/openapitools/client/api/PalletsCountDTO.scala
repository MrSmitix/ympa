package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PalletsCountDTO._

case class PalletsCountDTO (
  /* Количество палет, которое заявил продавец. */
  planned: Option[Integer],
/* Количество палет, которое приняли в сортировочном центре. */
  fact: Option[Integer])

object PalletsCountDTO {
  import DateTimeCodecs._

  implicit val PalletsCountDTOCodecJson: CodecJson[PalletsCountDTO] = CodecJson.derive[PalletsCountDTO]
  implicit val PalletsCountDTODecoder: EntityDecoder[PalletsCountDTO] = jsonOf[PalletsCountDTO]
  implicit val PalletsCountDTOEncoder: EntityEncoder[PalletsCountDTO] = jsonEncoderOf[PalletsCountDTO]
}
