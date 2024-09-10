package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
 */
case class ShelfsStatisticsAttributionType()

object ShelfsStatisticsAttributionType {
    /**
     * Creates the codec for converting ShelfsStatisticsAttributionType from and to JSON.
     */
    implicit val decoder: Decoder[ShelfsStatisticsAttributionType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ShelfsStatisticsAttributionType] = deriveEncoder
}
