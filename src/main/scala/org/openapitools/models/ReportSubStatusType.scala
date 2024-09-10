package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей. 
 */
case class ReportSubStatusType()

object ReportSubStatusType {
    /**
     * Creates the codec for converting ReportSubStatusType from and to JSON.
     */
    implicit val decoder: Decoder[ReportSubStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReportSubStatusType] = deriveEncoder
}
