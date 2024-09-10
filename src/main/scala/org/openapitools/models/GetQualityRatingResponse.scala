package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.CampaignsQualityRatingDTO

/**
 * Информация об индексе качества магазинов.
 * @param status 
 * @param result 
 */
case class GetQualityRatingResponse(status: Option[ApiResponseStatusType],
                result: Option[CampaignsQualityRatingDTO]
                )

object GetQualityRatingResponse {
    /**
     * Creates the codec for converting GetQualityRatingResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetQualityRatingResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetQualityRatingResponse] = deriveEncoder
}
