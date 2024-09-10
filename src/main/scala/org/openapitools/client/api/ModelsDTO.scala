package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModelsDTO._

case class ModelsDTO (
  /* Список моделей товаров. */
  models: List[ModelDTO])

object ModelsDTO {
  import DateTimeCodecs._

  implicit val ModelsDTOCodecJson: CodecJson[ModelsDTO] = CodecJson.derive[ModelsDTO]
  implicit val ModelsDTODecoder: EntityDecoder[ModelsDTO] = jsonOf[ModelsDTO]
  implicit val ModelsDTOEncoder: EntityEncoder[ModelsDTO] = jsonEncoderOf[ModelsDTO]
}
