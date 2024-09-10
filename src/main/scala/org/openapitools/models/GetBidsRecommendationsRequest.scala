package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * description.
 * @param skus Список товаров, для которых нужно получить рекомендации по ставкам. 
 */
case class GetBidsRecommendationsRequest(skus: Seq[String]
                )

object GetBidsRecommendationsRequest {
    /**
     * Creates the codec for converting GetBidsRecommendationsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetBidsRecommendationsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBidsRecommendationsRequest] = deriveEncoder
}
