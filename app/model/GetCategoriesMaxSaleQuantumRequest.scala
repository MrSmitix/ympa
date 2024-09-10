package model

import play.api.libs.json._
import scala.collection.immutable.Set

/**
  * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
  * @param marketCategoryIds Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCategoriesMaxSaleQuantumRequest(
  marketCategoryIds: Set[Long]
)

object GetCategoriesMaxSaleQuantumRequest {
  implicit lazy val getCategoriesMaxSaleQuantumRequestJsonFormat: Format[GetCategoriesMaxSaleQuantumRequest] = Json.format[GetCategoriesMaxSaleQuantumRequest]
}

