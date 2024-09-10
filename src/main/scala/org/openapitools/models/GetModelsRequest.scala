package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Запрос информации о моделях.
 * @param models Список моделей.
 */
case class GetModelsRequest(models: Seq[Long]
                )

object GetModelsRequest {
    /**
     * Creates the codec for converting GetModelsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetModelsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetModelsRequest] = deriveEncoder
}
