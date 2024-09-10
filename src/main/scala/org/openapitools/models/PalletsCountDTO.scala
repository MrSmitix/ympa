package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Количество палет в отгрузке.
 * @param planned Количество палет, которое заявил продавец.
 * @param fact Количество палет, которое приняли в сортировочном центре.
 */
case class PalletsCountDTO(planned: Option[Int],
                fact: Option[Int]
                )

object PalletsCountDTO {
    /**
     * Creates the codec for converting PalletsCountDTO from and to JSON.
     */
    implicit val decoder: Decoder[PalletsCountDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PalletsCountDTO] = deriveEncoder
}
