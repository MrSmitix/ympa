package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.TurnoverDTO
import org.openapitools.models.WarehouseStockDTO
import scala.collection.immutable.Seq

/**
 * Информация об остатках товара.
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param turnoverSummary 
 * @param stocks Информация об остатках.
 * @param updatedAt Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
 */
case class WarehouseOfferDTO(offerId: String,
                turnoverSummary: Option[TurnoverDTO],
                stocks: Seq[WarehouseStockDTO],
                updatedAt: Option[ZonedDateTime]
                )

object WarehouseOfferDTO {
    /**
     * Creates the codec for converting WarehouseOfferDTO from and to JSON.
     */
    implicit val decoder: Decoder[WarehouseOfferDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[WarehouseOfferDTO] = deriveEncoder
}
