package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FulfillmentWarehouseDTO
import scala.collection.immutable.Seq

/**
 * Список складов Маркета (FBY).
 * @param warehouses Список складов Маркета (FBY).
 */
case class FulfillmentWarehousesDTO(warehouses: Seq[FulfillmentWarehouseDTO]
                )

object FulfillmentWarehousesDTO {
    /**
     * Creates the codec for converting FulfillmentWarehousesDTO from and to JSON.
     */
    implicit val decoder: Decoder[FulfillmentWarehousesDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FulfillmentWarehousesDTO] = deriveEncoder
}
