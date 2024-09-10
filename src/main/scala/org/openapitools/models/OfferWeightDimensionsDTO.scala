package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal

/**
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 * @param length Длина упаковки в см. 
 * @param width Ширина упаковки в см. 
 * @param height Высота упаковки в см. 
 * @param weight Вес товара в кг с учетом упаковки (брутто). 
 */
case class OfferWeightDimensionsDTO(length: BigDecimal,
                width: BigDecimal,
                height: BigDecimal,
                weight: BigDecimal
                )

object OfferWeightDimensionsDTO {
    /**
     * Creates the codec for converting OfferWeightDimensionsDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferWeightDimensionsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferWeightDimensionsDTO] = deriveEncoder
}
