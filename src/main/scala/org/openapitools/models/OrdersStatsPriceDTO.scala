package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrdersStatsPriceType

/**
 * Цена или скидки на товар.
 * @param _type 
 * @param costPerItem Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
 * @param total Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
 */
case class OrdersStatsPriceDTO(_type: Option[OrdersStatsPriceType],
                costPerItem: Option[BigDecimal],
                total: Option[BigDecimal]
                )

object OrdersStatsPriceDTO {
    /**
     * Creates the codec for converting OrdersStatsPriceDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsPriceDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsPriceDTO] = deriveEncoder
}
