package model

import play.api.libs.json._

/**
  * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
  * @param id Идентификатор категории.
  * @param name Название категории.
  * @param children Дочерние категории.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CategoryDTO(
  id: Long,
  name: String,
  children: Option[List[CategoryDTO]]
)

object CategoryDTO {
  implicit lazy val categoryDTOJsonFormat: Format[CategoryDTO] = Json.format[CategoryDTO]
}

