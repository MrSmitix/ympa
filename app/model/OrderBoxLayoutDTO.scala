package model

import play.api.libs.json._

/**
  * Информация о коробке.
  * @param items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderBoxLayoutDTO(
  items: List[OrderBoxLayoutItemDTO]
)

object OrderBoxLayoutDTO {
  implicit lazy val orderBoxLayoutDTOJsonFormat: Format[OrderBoxLayoutDTO] = Json.format[OrderBoxLayoutDTO]
}

