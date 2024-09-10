package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о текущей карточке товара на Маркете.
 * @param marketSku SKU на Маркете.
 * @param modelId Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
 * @param categoryId Идентификатор категории для текущей карточки товара на Маркете.
 */
case class OfferMappingDTO(marketSku: Option[Long],
                modelId: Option[Long],
                categoryId: Option[Long]
                )

object OfferMappingDTO {
    /**
     * Creates the codec for converting OfferMappingDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferMappingDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferMappingDTO] = deriveEncoder
}
