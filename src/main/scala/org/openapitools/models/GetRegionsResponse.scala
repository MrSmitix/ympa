package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.RegionDTO
import scala.collection.immutable.Seq

/**
 * 
 * @param regions Регион доставки.
 * @param paging 
 */
case class GetRegionsResponse(regions: Seq[RegionDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object GetRegionsResponse {
    /**
     * Creates the codec for converting GetRegionsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetRegionsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetRegionsResponse] = deriveEncoder
}
