package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. 
 */
case class OrdersStatsPriceType()

object OrdersStatsPriceType {
    /**
     * Creates the codec for converting OrdersStatsPriceType from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsPriceType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsPriceType] = deriveEncoder
}
