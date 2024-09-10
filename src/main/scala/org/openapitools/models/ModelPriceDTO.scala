package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal

/**
 * Информация о ценах на модель товара.
 * @param avg Средняя цена предложения для модели в регионе.
 * @param max Максимальная цена предложения для модели в регионе.
 * @param min Минимальная цена предложения для модели в регионе.
 */
case class ModelPriceDTO(avg: Option[BigDecimal],
                max: Option[BigDecimal],
                min: Option[BigDecimal]
                )

object ModelPriceDTO {
    /**
     * Creates the codec for converting ModelPriceDTO from and to JSON.
     */
    implicit val decoder: Decoder[ModelPriceDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ModelPriceDTO] = deriveEncoder
}
