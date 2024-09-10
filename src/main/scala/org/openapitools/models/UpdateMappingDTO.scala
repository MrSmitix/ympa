package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 * @param marketSku SKU на Маркете.
 */
case class UpdateMappingDTO(marketSku: Option[Long]
                )

object UpdateMappingDTO {
    /**
     * Creates the codec for converting UpdateMappingDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdateMappingDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateMappingDTO] = deriveEncoder
}
