package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime

/**
 * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре `full`. Выводится, если параметр `publication status=OK`. 
 * @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @param publishedTime Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 */
case class FeedPublicationPriceAndStockUpdateDTO(fileTime: Option[ZonedDateTime],
                publishedTime: Option[ZonedDateTime]
                )

object FeedPublicationPriceAndStockUpdateDTO {
    /**
     * Creates the codec for converting FeedPublicationPriceAndStockUpdateDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedPublicationPriceAndStockUpdateDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedPublicationPriceAndStockUpdateDTO] = deriveEncoder
}