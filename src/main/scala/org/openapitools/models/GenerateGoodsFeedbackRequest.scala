package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Данные, необходимые для генерации отчета. 
 * @param businessId Идентификатор бизнеса.
 */
case class GenerateGoodsFeedbackRequest(businessId: Long
                )

object GenerateGoodsFeedbackRequest {
    /**
     * Creates the codec for converting GenerateGoodsFeedbackRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateGoodsFeedbackRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateGoodsFeedbackRequest] = deriveEncoder
}
