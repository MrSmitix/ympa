package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ParcelBoxDTO
import scala.collection.immutable.Seq

/**
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 * @param boxes Список грузовых мест. Маркет определил количество мест по длине этого списка. 
 */
case class ShipmentBoxesDTO(boxes: Seq[ParcelBoxDTO]
                )

object ShipmentBoxesDTO {
    /**
     * Creates the codec for converting ShipmentBoxesDTO from and to JSON.
     */
    implicit val decoder: Decoder[ShipmentBoxesDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ShipmentBoxesDTO] = deriveEncoder
}
