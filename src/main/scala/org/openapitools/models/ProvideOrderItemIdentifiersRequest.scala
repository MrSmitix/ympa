package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderItemInstanceModificationDTO
import scala.collection.immutable.Seq

/**
 * 
 * @param items Список позиций, требующих маркировки. 
 */
case class ProvideOrderItemIdentifiersRequest(items: Seq[OrderItemInstanceModificationDTO]
                )

object ProvideOrderItemIdentifiersRequest {
    /**
     * Creates the codec for converting ProvideOrderItemIdentifiersRequest from and to JSON.
     */
    implicit val decoder: Decoder[ProvideOrderItemIdentifiersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProvideOrderItemIdentifiersRequest] = deriveEncoder
}
