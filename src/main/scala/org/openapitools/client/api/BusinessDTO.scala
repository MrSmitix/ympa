package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessDTO._

case class BusinessDTO (
  /* Идентификатор кабинета. */
  id: Option[Long],
/* Название бизнеса. */
  name: Option[String])

object BusinessDTO {
  import DateTimeCodecs._

  implicit val BusinessDTOCodecJson: CodecJson[BusinessDTO] = CodecJson.derive[BusinessDTO]
  implicit val BusinessDTODecoder: EntityDecoder[BusinessDTO] = jsonOf[BusinessDTO]
  implicit val BusinessDTOEncoder: EntityEncoder[BusinessDTO] = jsonEncoderOf[BusinessDTO]
}
