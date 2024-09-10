package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ParcelBoxDTO._

case class ParcelBoxDTO (
  /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
  id: Option[Long],
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
  fulfilmentId: Option[String])

object ParcelBoxDTO {
  import DateTimeCodecs._

  implicit val ParcelBoxDTOCodecJson: CodecJson[ParcelBoxDTO] = CodecJson.derive[ParcelBoxDTO]
  implicit val ParcelBoxDTODecoder: EntityDecoder[ParcelBoxDTO] = jsonOf[ParcelBoxDTO]
  implicit val ParcelBoxDTOEncoder: EntityEncoder[ParcelBoxDTO] = jsonEncoderOf[ParcelBoxDTO]
}
