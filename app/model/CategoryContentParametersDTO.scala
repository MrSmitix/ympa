package model

import play.api.libs.json._

/**
  * Информация о параметрах категории.
  * @param categoryId Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
  * @param parameters Список характеристик.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CategoryContentParametersDTO(
  categoryId: Int,
  parameters: Option[List[CategoryParameterDTO]]
)

object CategoryContentParametersDTO {
  implicit lazy val categoryContentParametersDTOJsonFormat: Format[CategoryContentParametersDTO] = Json.format[CategoryContentParametersDTO]
}

