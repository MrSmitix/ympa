package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UpdateStockDTO

/**
 * Запрос на изменение информации по остаткам товаров.
 * @param skus Данные об остатках товаров. 
 */
case class UpdateStocksRequest(skus: Set[UpdateStockDTO]
                )

object UpdateStocksRequest {
    /**
     * Creates the codec for converting UpdateStocksRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateStocksRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateStocksRequest] = deriveEncoder
}
