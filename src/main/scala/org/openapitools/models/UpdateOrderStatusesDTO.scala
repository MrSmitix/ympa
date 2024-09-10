package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UpdateOrderStatusDTO
import scala.collection.immutable.Seq

/**
 * Список заказов, статус которых обновился.
 * @param orders Список с обновленными заказами.
 */
case class UpdateOrderStatusesDTO(orders: Seq[UpdateOrderStatusDTO]
                )

object UpdateOrderStatusesDTO {
    /**
     * Creates the codec for converting UpdateOrderStatusesDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOrderStatusesDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOrderStatusesDTO] = deriveEncoder
}
