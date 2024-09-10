package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 * @param id Идентификатор категории.
 * @param name Название категории.
 * @param maxSaleQuantum Лимит на установку кванта и минимального количества товаров.
 */
case class MaxSaleQuantumDTO(id: Long,
                name: Option[String],
                maxSaleQuantum: Option[Int]
                )

object MaxSaleQuantumDTO {
    /**
     * Creates the codec for converting MaxSaleQuantumDTO from and to JSON.
     */
    implicit val decoder: Decoder[MaxSaleQuantumDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[MaxSaleQuantumDTO] = deriveEncoder
}
