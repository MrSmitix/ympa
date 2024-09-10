package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.WarehouseAddressDTO

/**
 * Склад Маркета (FBY).
 * @param id Идентификатор склада.
 * @param name Название склада.
 * @param address 
 */
case class FulfillmentWarehouseDTO(id: Long,
                name: String,
                address: Option[WarehouseAddressDTO]
                )

object FulfillmentWarehouseDTO {
    /**
     * Creates the codec for converting FulfillmentWarehouseDTO from and to JSON.
     */
    implicit val decoder: Decoder[FulfillmentWarehouseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FulfillmentWarehouseDTO] = deriveEncoder
}
