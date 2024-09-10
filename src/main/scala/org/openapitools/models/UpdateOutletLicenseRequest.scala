package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OutletLicenseDTO
import scala.collection.immutable.Seq

/**
 * Запрос на создание или изменение лицензий для точек продаж.
 * @param licenses Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
 */
case class UpdateOutletLicenseRequest(licenses: Seq[OutletLicenseDTO]
                )

object UpdateOutletLicenseRequest {
    /**
     * Creates the codec for converting UpdateOutletLicenseRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOutletLicenseRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOutletLicenseRequest] = deriveEncoder
}
