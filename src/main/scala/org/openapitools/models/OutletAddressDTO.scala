package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Адрес точки продаж. 
 * @param regionId Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
 * @param street Улица.
 * @param number Номер дома.
 * @param building Номер строения.
 * @param estate Номер владения.
 * @param block Номер корпуса.
 * @param additional Дополнительная информация.
 * @param km Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
 * @param city {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
 */
case class OutletAddressDTO(regionId: Long,
                street: Option[String],
                number: Option[String],
                building: Option[String],
                estate: Option[String],
                block: Option[String],
                additional: Option[String],
                km: Option[Int],
                city: Option[String]
                )

object OutletAddressDTO {
    /**
     * Creates the codec for converting OutletAddressDTO from and to JSON.
     */
    implicit val decoder: Decoder[OutletAddressDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OutletAddressDTO] = deriveEncoder
}
