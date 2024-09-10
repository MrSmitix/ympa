package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.DeliveryServiceInfoDTO
import scala.collection.immutable.Seq

/**
 * Информация о службах доставки.
 * @param deliveryService Информация о службе доставки.
 */
case class DeliveryServicesDTO(deliveryService: Seq[DeliveryServiceInfoDTO]
                )

object DeliveryServicesDTO {
    /**
     * Creates the codec for converting DeliveryServicesDTO from and to JSON.
     */
    implicit val decoder: Decoder[DeliveryServicesDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeliveryServicesDTO] = deriveEncoder
}
