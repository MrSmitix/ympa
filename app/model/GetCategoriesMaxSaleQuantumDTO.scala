package model

import play.api.libs.json._

/**
  * Категории и лимит на установку кванта и минимального количества товаров.
  * @param results Категории и лимит на установку кванта и минимального количества товаров.
  * @param errors Ошибки, которые появились из-за переданных категорий.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCategoriesMaxSaleQuantumDTO(
  results: List[MaxSaleQuantumDTO],
  errors: Option[List[CategoryErrorDTO]]
)

object GetCategoriesMaxSaleQuantumDTO {
  implicit lazy val getCategoriesMaxSaleQuantumDTOJsonFormat: Format[GetCategoriesMaxSaleQuantumDTO] = Json.format[GetCategoriesMaxSaleQuantumDTO]
}

