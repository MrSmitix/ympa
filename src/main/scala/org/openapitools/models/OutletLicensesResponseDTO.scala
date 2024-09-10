package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FullOutletLicenseDTO
import scala.collection.immutable.Seq

/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 * @param licenses Список лицензий.
 */
case class OutletLicensesResponseDTO(licenses: Seq[FullOutletLicenseDTO]
                )

object OutletLicensesResponseDTO {
    /**
     * Creates the codec for converting OutletLicensesResponseDTO from and to JSON.
     */
    implicit val decoder: Decoder[OutletLicensesResponseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OutletLicensesResponseDTO] = deriveEncoder
}
