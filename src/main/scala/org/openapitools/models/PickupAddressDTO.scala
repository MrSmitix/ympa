package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Адрес доставки.
 * @param country Страна.
 * @param city Город.
 * @param street Улица.
 * @param house Номер дома.
 * @param postcode Почтовый индекс.
 */
case class PickupAddressDTO(country: Option[String],
                city: Option[String],
                street: Option[String],
                house: Option[String],
                postcode: Option[String]
                )

object PickupAddressDTO {
    /**
     * Creates the codec for converting PickupAddressDTO from and to JSON.
     */
    implicit val decoder: Decoder[PickupAddressDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PickupAddressDTO] = deriveEncoder
}
