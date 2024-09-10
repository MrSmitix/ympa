package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Причина обновления состава заказа.
 */
case class OrderItemsModificationRequestReasonType()

object OrderItemsModificationRequestReasonType {
    /**
     * Creates the codec for converting OrderItemsModificationRequestReasonType from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemsModificationRequestReasonType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemsModificationRequestReasonType] = deriveEncoder
}
