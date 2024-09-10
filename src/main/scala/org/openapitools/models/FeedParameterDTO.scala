package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Параметр прайс-листа.
 * @param deleted Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. 
 * @param name Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. 
 * @param values Значения параметра.  Используется вместе с параметром `name`. 
 */
case class FeedParameterDTO(deleted: Option[Boolean],
                name: String,
                values: Option[Seq[Int]]
                )

object FeedParameterDTO {
    /**
     * Creates the codec for converting FeedParameterDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedParameterDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedParameterDTO] = deriveEncoder
}
