package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnrichedModelsDTO._

case class EnrichedModelsDTO (
  /* Список моделей товаров. */
  models: List[EnrichedModelDTO])

object EnrichedModelsDTO {
  import DateTimeCodecs._

  implicit val EnrichedModelsDTOCodecJson: CodecJson[EnrichedModelsDTO] = CodecJson.derive[EnrichedModelsDTO]
  implicit val EnrichedModelsDTODecoder: EntityDecoder[EnrichedModelsDTO] = jsonOf[EnrichedModelsDTO]
  implicit val EnrichedModelsDTOEncoder: EntityEncoder[EnrichedModelsDTO] = jsonEncoderOf[EnrichedModelsDTO]
}
