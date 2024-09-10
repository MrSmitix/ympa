package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ParcelBoxDTO
import scala.collection.immutable.Seq

/**
 * Информация о грузовых местах в заказе.
 * @param boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка.
 */
case class ParcelDTO(boxes: Seq[ParcelBoxDTO]
                )

object ParcelDTO {
    /**
     * Creates the codec for converting ParcelDTO from and to JSON.
     */
    implicit val decoder: Decoder[ParcelDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ParcelDTO] = deriveEncoder
}
