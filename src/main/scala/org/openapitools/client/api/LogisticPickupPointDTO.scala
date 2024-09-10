package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LogisticPickupPointDTO._

case class LogisticPickupPointDTO (
  /* Идентификатор пункта вывоза. */
  id: Option[Long],
/* Название пункта вывоза. */
  name: Option[String],
address: Option[PickupAddressDTO],
/* Дополнительные инструкции к вывозу. */
  instruction: Option[String],
`type`: Option[LogisticPointType],
/* Идентификатор логистического партнера, к которому относится логистическая точка. */
  logisticPartnerId: Option[Long])

object LogisticPickupPointDTO {
  import DateTimeCodecs._

  implicit val LogisticPickupPointDTOCodecJson: CodecJson[LogisticPickupPointDTO] = CodecJson.derive[LogisticPickupPointDTO]
  implicit val LogisticPickupPointDTODecoder: EntityDecoder[LogisticPickupPointDTO] = jsonOf[LogisticPickupPointDTO]
  implicit val LogisticPickupPointDTOEncoder: EntityEncoder[LogisticPickupPointDTO] = jsonEncoderOf[LogisticPickupPointDTO]
}
