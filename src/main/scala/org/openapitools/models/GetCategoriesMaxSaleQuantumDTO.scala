package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CategoryErrorDTO
import org.openapitools.models.MaxSaleQuantumDTO
import scala.collection.immutable.Seq

/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 * @param results Категории и лимит на установку кванта и минимального количества товаров.
 * @param errors Ошибки, которые появились из-за переданных категорий.
 */
case class GetCategoriesMaxSaleQuantumDTO(results: Seq[MaxSaleQuantumDTO],
                errors: Option[Seq[CategoryErrorDTO]]
                )

object GetCategoriesMaxSaleQuantumDTO {
    /**
     * Creates the codec for converting GetCategoriesMaxSaleQuantumDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetCategoriesMaxSaleQuantumDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCategoriesMaxSaleQuantumDTO] = deriveEncoder
}
