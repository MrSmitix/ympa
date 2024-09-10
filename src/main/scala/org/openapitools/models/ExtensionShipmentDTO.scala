package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ShipmentActionType
import org.openapitools.models.ShipmentStatusChangeDTO

/**
 * Информация об отгрузке.
 * @param currentStatus 
 * @param availableActions Доступные действия над отгрузкой.
 */
case class ExtensionShipmentDTO(currentStatus: Option[ShipmentStatusChangeDTO],
                availableActions: Set[ShipmentActionType]
                )

object ExtensionShipmentDTO {
    /**
     * Creates the codec for converting ExtensionShipmentDTO from and to JSON.
     */
    implicit val decoder: Decoder[ExtensionShipmentDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ExtensionShipmentDTO] = deriveEncoder
}
