package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип региона.  Возможные значения:  * `CITY_DISTRICT` — район города.  * `CITY` — крупный город.  * `CONTINENT` — континент.  * `COUNTRY_DISTRICT` — область.  * `COUNTRY` — страна.  * `REGION` — регион.  * `REPUBLIC_AREA` — район субъекта федерации.  * `REPUBLIC` — субъект федерации.  * `SUBWAY_STATION` — станция метро.  * `VILLAGE` — город.  * `OTHER` — неизвестный регион. 
 */
case class RegionType()

object RegionType {
    /**
     * Creates the codec for converting RegionType from and to JSON.
     */
    implicit val decoder: Decoder[RegionType] = deriveDecoder
    implicit val encoder: ObjectEncoder[RegionType] = deriveEncoder
}
