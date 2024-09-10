package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.ShipmentStatusType

/**
 * Статус отгрузки.
 * @param status 
 * @param description Описание статуса отгрузки.
 * @param updateTime Время последнего изменения статуса отгрузки.
 */
case class ShipmentStatusChangeDTO(status: Option[ShipmentStatusType],
                description: Option[String],
                updateTime: Option[ZonedDateTime]
                )

object ShipmentStatusChangeDTO {
    /**
     * Creates the codec for converting ShipmentStatusChangeDTO from and to JSON.
     */
    implicit val decoder: Decoder[ShipmentStatusChangeDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ShipmentStatusChangeDTO] = deriveEncoder
}
