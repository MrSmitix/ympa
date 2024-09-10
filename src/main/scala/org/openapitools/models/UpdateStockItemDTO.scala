package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime

/**
 * Информация об остатках товара. 
 * @param count Количество доступного товара. 
 * @param updatedAt Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 */
case class UpdateStockItemDTO(count: Long,
                updatedAt: Option[ZonedDateTime]
                )

object UpdateStockItemDTO {
    /**
     * Creates the codec for converting UpdateStockItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdateStockItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateStockItemDTO] = deriveEncoder
}
