package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 * @param id {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 * @param fulfilmentId {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 */
case class ParcelBoxDTO(id: Option[Long],
                fulfilmentId: Option[String]
                )

object ParcelBoxDTO {
    /**
     * Creates the codec for converting ParcelBoxDTO from and to JSON.
     */
    implicit val decoder: Decoder[ParcelBoxDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ParcelBoxDTO] = deriveEncoder
}
