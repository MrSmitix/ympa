package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 * @param marketCategoryIds Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
 */
case class GetCategoriesMaxSaleQuantumRequest(marketCategoryIds: Set[Long]
                )

object GetCategoriesMaxSaleQuantumRequest {
    /**
     * Creates the codec for converting GetCategoriesMaxSaleQuantumRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetCategoriesMaxSaleQuantumRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCategoriesMaxSaleQuantumRequest] = deriveEncoder
}
