package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Данные о складе отправления.
 * @param id Идентификатор склада отправления.
 * @param name Наименование склада отправления.
 * @param address Адрес склада отправления.
 */
case class PartnerShipmentWarehouseDTO(id: Option[Long],
                name: Option[String],
                address: Option[String]
                )

object PartnerShipmentWarehouseDTO {
    /**
     * Creates the codec for converting PartnerShipmentWarehouseDTO from and to JSON.
     */
    implicit val decoder: Decoder[PartnerShipmentWarehouseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PartnerShipmentWarehouseDTO] = deriveEncoder
}
