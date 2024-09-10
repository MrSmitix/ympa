package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.EnrichedModelDTO
import scala.collection.immutable.Seq

/**
 * Список моделей товаров.
 * @param models Список моделей товаров.
 */
case class EnrichedModelsDTO(models: Seq[EnrichedModelDTO]
                )

object EnrichedModelsDTO {
    /**
     * Creates the codec for converting EnrichedModelsDTO from and to JSON.
     */
    implicit val decoder: Decoder[EnrichedModelsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnrichedModelsDTO] = deriveEncoder
}
