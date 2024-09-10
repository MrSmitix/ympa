package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
 */
case class ShowsSalesGroupingType()

object ShowsSalesGroupingType {
    /**
     * Creates the codec for converting ShowsSalesGroupingType from and to JSON.
     */
    implicit val decoder: Decoder[ShowsSalesGroupingType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ShowsSalesGroupingType] = deriveEncoder
}
