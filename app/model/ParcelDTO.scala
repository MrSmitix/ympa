package model

import play.api.libs.json._

/**
  * Информация о грузовых местах в заказе.
  * @param boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ParcelDTO(
  boxes: List[ParcelBoxDTO]
)

object ParcelDTO {
  implicit lazy val parcelDTOJsonFormat: Format[ParcelDTO] = Json.format[ParcelDTO]
}

