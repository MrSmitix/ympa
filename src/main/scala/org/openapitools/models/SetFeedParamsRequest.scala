package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedParameterDTO
import scala.collection.immutable.Seq

/**
 * Запрос на обновление изменение параметров прайс-листа.
 * @param parameters Параметры прайс-листа.  Обязательный параметр. 
 */
case class SetFeedParamsRequest(parameters: Seq[FeedParameterDTO]
                )

object SetFeedParamsRequest {
    /**
     * Creates the codec for converting SetFeedParamsRequest from and to JSON.
     */
    implicit val decoder: Decoder[SetFeedParamsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SetFeedParamsRequest] = deriveEncoder
}
