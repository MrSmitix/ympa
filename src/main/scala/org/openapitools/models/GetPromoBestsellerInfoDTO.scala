package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime

/**
 * Информация об акции «Бестселлеры Маркета».
 * @param bestseller Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
 * @param entryDeadline До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
 */
case class GetPromoBestsellerInfoDTO(bestseller: Boolean,
                entryDeadline: Option[ZonedDateTime]
                )

object GetPromoBestsellerInfoDTO {
    /**
     * Creates the codec for converting GetPromoBestsellerInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetPromoBestsellerInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromoBestsellerInfoDTO] = deriveEncoder
}
