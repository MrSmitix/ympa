package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. 
 */
case class ReportStatusType()

object ReportStatusType {
    /**
     * Creates the codec for converting ReportStatusType from and to JSON.
     */
    implicit val decoder: Decoder[ReportStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReportStatusType] = deriveEncoder
}
