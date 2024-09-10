package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FlippingPagerDTO
import org.openapitools.models.FullOutletDTO
import org.openapitools.models.ScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Ответ на запрос информации о точках продаж.
 * @param outlets Информация о точках продаж.
 * @param paging 
 * @param pager 
 */
case class GetOutletsResponse(outlets: Seq[FullOutletDTO],
                paging: Option[ScrollingPagerDTO],
                pager: Option[FlippingPagerDTO]
                )

object GetOutletsResponse {
    /**
     * Creates the codec for converting GetOutletsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOutletsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOutletsResponse] = deriveEncoder
}
