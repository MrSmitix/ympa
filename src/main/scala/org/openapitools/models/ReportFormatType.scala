package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета. 
 */
case class ReportFormatType()

object ReportFormatType {
    /**
     * Creates the codec for converting ReportFormatType from and to JSON.
     */
    implicit val decoder: Decoder[ReportFormatType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReportFormatType] = deriveEncoder
}
