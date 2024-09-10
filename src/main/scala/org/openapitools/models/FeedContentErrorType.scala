package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип ошибки в содержимом прайс-листа.  Возможные значения:  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
 */
case class FeedContentErrorType()

object FeedContentErrorType {
    /**
     * Creates the codec for converting FeedContentErrorType from and to JSON.
     */
    implicit val decoder: Decoder[FeedContentErrorType] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedContentErrorType] = deriveEncoder
}
