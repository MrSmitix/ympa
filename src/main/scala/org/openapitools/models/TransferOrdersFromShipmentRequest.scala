package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Запрос переноса заказов из отгрузки.
 * @param orderIds Список заказов, которые вы не успеваете подготовить.
 */
case class TransferOrdersFromShipmentRequest(orderIds: Seq[Long]
                )

object TransferOrdersFromShipmentRequest {
    /**
     * Creates the codec for converting TransferOrdersFromShipmentRequest from and to JSON.
     */
    implicit val decoder: Decoder[TransferOrdersFromShipmentRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[TransferOrdersFromShipmentRequest] = deriveEncoder
}
