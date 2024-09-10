package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CategoryParameterDTO
import scala.collection.immutable.Seq

/**
 * Информация о параметрах категории.
 * @param categoryId Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
 * @param parameters Список характеристик.
 */
case class CategoryContentParametersDTO(categoryId: Int,
                parameters: Option[Seq[CategoryParameterDTO]]
                )

object CategoryContentParametersDTO {
    /**
     * Creates the codec for converting CategoryContentParametersDTO from and to JSON.
     */
    implicit val decoder: Decoder[CategoryContentParametersDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CategoryContentParametersDTO] = deriveEncoder
}
