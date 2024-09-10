package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModelDTO._

case class ModelDTO (
  /* Идентификатор модели товара. */
  id: Option[Long],
/* Название модели товара. */
  name: Option[String],
prices: Option[ModelPriceDTO])

object ModelDTO {
  import DateTimeCodecs._

  implicit val ModelDTOCodecJson: CodecJson[ModelDTO] = CodecJson.derive[ModelDTO]
  implicit val ModelDTODecoder: EntityDecoder[ModelDTO] = jsonOf[ModelDTO]
  implicit val ModelDTOEncoder: EntityEncoder[ModelDTO] = jsonEncoderOf[ModelDTO]
}
