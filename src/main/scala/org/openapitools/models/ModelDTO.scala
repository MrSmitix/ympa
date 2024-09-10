package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ModelPriceDTO

/**
 * Модель товара.
 * @param id Идентификатор модели товара.
 * @param name Название модели товара.
 * @param prices 
 */
case class ModelDTO(id: Option[Long],
                name: Option[String],
                prices: Option[ModelPriceDTO]
                )

object ModelDTO {
    /**
     * Creates the codec for converting ModelDTO from and to JSON.
     */
    implicit val decoder: Decoder[ModelDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ModelDTO] = deriveEncoder
}
