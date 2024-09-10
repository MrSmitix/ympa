package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Размещение ярлыков на странице: * `A7` — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * `A4` — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей. 
 */
case class PageFormatType()

object PageFormatType {
    /**
     * Creates the codec for converting PageFormatType from and to JSON.
     */
    implicit val decoder: Decoder[PageFormatType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PageFormatType] = deriveEncoder
}
