package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FlippingPagerDTO
import org.openapitools.models.RegionDTO

/**
 * 
 * @param pager 
 * @param regions 
 */
case class GetRegionWithChildrenResponse(pager: Option[FlippingPagerDTO],
                regions: Option[RegionDTO]
                )

object GetRegionWithChildrenResponse {
    /**
     * Creates the codec for converting GetRegionWithChildrenResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetRegionWithChildrenResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetRegionWithChildrenResponse] = deriveEncoder
}
