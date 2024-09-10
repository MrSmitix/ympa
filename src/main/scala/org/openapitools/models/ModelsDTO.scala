package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ModelDTO
import scala.collection.immutable.Seq

/**
 * Список моделей товаров.
 * @param models Список моделей товаров.
 */
case class ModelsDTO(models: Seq[ModelDTO]
                )

object ModelsDTO {
    /**
     * Creates the codec for converting ModelsDTO from and to JSON.
     */
    implicit val decoder: Decoder[ModelsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ModelsDTO] = deriveEncoder
}
