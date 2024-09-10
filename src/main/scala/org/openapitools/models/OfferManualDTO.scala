package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Инструкция по использованию товара. 
 * @param url Ссылка на инструкцию.
 * @param title Название инструкции, которое будет отображаться на карточке товара. 
 */
case class OfferManualDTO(url: String,
                title: Option[String]
                )

object OfferManualDTO {
    /**
     * Creates the codec for converting OfferManualDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferManualDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferManualDTO] = deriveEncoder
}
