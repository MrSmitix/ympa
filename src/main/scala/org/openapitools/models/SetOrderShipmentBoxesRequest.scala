package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ParcelBoxDTO
import scala.collection.immutable.Seq

/**
 * 
 * @param boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка.
 */
case class SetOrderShipmentBoxesRequest(boxes: Seq[ParcelBoxDTO]
                )

object SetOrderShipmentBoxesRequest {
    /**
     * Creates the codec for converting SetOrderShipmentBoxesRequest from and to JSON.
     */
    implicit val decoder: Decoder[SetOrderShipmentBoxesRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SetOrderShipmentBoxesRequest] = deriveEncoder
}
