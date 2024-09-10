package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FlippingPagerDTO
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.OrderDTO
import scala.collection.immutable.Seq

/**
 * Модель для ответа API списка информации по заказам.
 * @param pager 
 * @param orders Модель заказа. 
 * @param paging 
 */
case class GetOrdersResponse(pager: Option[FlippingPagerDTO],
                orders: Seq[OrderDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object GetOrdersResponse {
    /**
     * Creates the codec for converting GetOrdersResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOrdersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOrdersResponse] = deriveEncoder
}
