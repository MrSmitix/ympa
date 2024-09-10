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
 * @param boxId Идентификатор коробки.
 */
case class EnrichedOrderBoxLayoutDTO(items: Seq[OrderBoxLayoutItemDTO],
                boxId: Option[Long]
                )

object EnrichedOrderBoxLayoutDTO {
    /**
     * Creates the codec for converting EnrichedOrderBoxLayoutDTO from and to JSON.
     */
    implicit val decoder: Decoder[EnrichedOrderBoxLayoutDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnrichedOrderBoxLayoutDTO] = deriveEncoder
}
