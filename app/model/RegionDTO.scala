package model

import play.api.libs.json._

/**
  * Регион доставки.
  * @param id Идентификатор региона.
  * @param name Название региона.
  * @param children Дочерние регионы.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class RegionDTO(
  id: Option[Long],
  name: String,
  `type`: RegionType,
  parent: Option[RegionDTO],
  children: Option[List[RegionDTO]]
)

object RegionDTO {
  implicit lazy val regionDTOJsonFormat: Format[RegionDTO] = Json.format[RegionDTO]
}

