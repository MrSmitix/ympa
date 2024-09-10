package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderBoxLayoutDTO
import scala.collection.immutable.Seq

/**
 * 
 * @param boxes Список коробок.
 * @param allowRemove Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
 */
case class SetOrderBoxLayoutRequest(boxes: Seq[OrderBoxLayoutDTO],
                allowRemove: Option[Boolean]
                )

object SetOrderBoxLayoutRequest {
    /**
     * Creates the codec for converting SetOrderBoxLayoutRequest from and to JSON.
     */
    implicit val decoder: Decoder[SetOrderBoxLayoutRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SetOrderBoxLayoutRequest] = deriveEncoder
}
