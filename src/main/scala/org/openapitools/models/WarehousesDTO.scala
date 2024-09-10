package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.WarehouseDTO
import org.openapitools.models.WarehouseGroupDTO
import scala.collection.immutable.Seq

/**
 * Информация о складах и группах складов.
 * @param warehouses Список складов, не входящих в группы.
 * @param warehouseGroups Список групп складов.
 */
case class WarehousesDTO(warehouses: Seq[WarehouseDTO],
                warehouseGroups: Seq[WarehouseGroupDTO]
                )

object WarehousesDTO {
    /**
     * Creates the codec for converting WarehousesDTO from and to JSON.
     */
    implicit val decoder: Decoder[WarehousesDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[WarehousesDTO] = deriveEncoder
}
