package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderBoxLayoutItemDTO
import scala.collection.immutable.Seq

/**
 * Информация о коробке.
 * @param items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
 */
case class OrderBoxLayoutDTO(items: Seq[OrderBoxLayoutItemDTO]
                )

object OrderBoxLayoutDTO {
    /**
     * Creates the codec for converting OrderBoxLayoutDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderBoxLayoutDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderBoxLayoutDTO] = deriveEncoder
}
