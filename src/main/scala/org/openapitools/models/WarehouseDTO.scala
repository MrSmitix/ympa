package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.WarehouseAddressDTO

/**
 * Информация о складе.
 * @param id Идентификатор склада.
 * @param name Название склада.
 * @param campaignId Идентификатор кампании в API и идентификатор магазина.
 * @param express Возможна ли доставка по модели Экспресс.
 * @param address 
 */
case class WarehouseDTO(id: Long,
                name: String,
                campaignId: Long,
                express: Boolean,
                address: Option[WarehouseAddressDTO]
                )

object WarehouseDTO {
    /**
     * Creates the codec for converting WarehouseDTO from and to JSON.
     */
    implicit val decoder: Decoder[WarehouseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[WarehouseDTO] = deriveEncoder
}
