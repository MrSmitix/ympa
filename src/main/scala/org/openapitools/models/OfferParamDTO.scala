package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же `name`, но разными `value`.  {% cut \"Пример\" %}  ```json \"params\": [   {     \"name\": \"Цвет\",     \"value\": \"Зеленый\"   },   {     \"name\": \"Цвет\",     \"value\": \"Желтый\"   } ] ```  {% endcut %} 
 * @param name Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). 
 * @param value Значение. 
 */
case class OfferParamDTO(name: String,
                value: String
                )

object OfferParamDTO {
    /**
     * Creates the codec for converting OfferParamDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferParamDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferParamDTO] = deriveEncoder
}
