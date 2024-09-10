package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.ShipmentInfoDTO
import scala.collection.immutable.Seq

/**
 * Информация об отгрузках.
 * @param shipments Список с информацией об отгрузках.
 * @param paging 
 */
case class SearchShipmentsResponseDTO(shipments: Seq[ShipmentInfoDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object SearchShipmentsResponseDTO {
    /**
     * Creates the codec for converting SearchShipmentsResponseDTO from and to JSON.
     */
    implicit val decoder: Decoder[SearchShipmentsResponseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[SearchShipmentsResponseDTO] = deriveEncoder
}
