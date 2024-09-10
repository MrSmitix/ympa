package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GpsDTO

/**
 * Адрес склада.
 * @param city Город.
 * @param street Улица.
 * @param number Номер дома.
 * @param building Номер строения.
 * @param block Номер корпуса.
 * @param gps 
 */
case class WarehouseAddressDTO(city: String,
                street: Option[String],
                number: Option[String],
                building: Option[String],
                block: Option[String],
                gps: GpsDTO
                )

object WarehouseAddressDTO {
    /**
     * Creates the codec for converting WarehouseAddressDTO from and to JSON.
     */
    implicit val decoder: Decoder[WarehouseAddressDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[WarehouseAddressDTO] = deriveEncoder
}
