package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.WarehouseDTO
import scala.collection.immutable.Seq

/**
 * Информация о группе складов.
 * @param name Название группы складов.
 * @param mainWarehouse 
 * @param warehouses Список складов, входящих в группу.
 */
case class WarehouseGroupDTO(name: String,
                mainWarehouse: WarehouseDTO,
                warehouses: Seq[WarehouseDTO]
                )

object WarehouseGroupDTO {
    /**
     * Creates the codec for converting WarehouseGroupDTO from and to JSON.
     */
    implicit val decoder: Decoder[WarehouseGroupDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[WarehouseGroupDTO] = deriveEncoder
}
