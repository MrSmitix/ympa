package model

import play.api.libs.json._

/**
  * Единицы измерения характеристики товара.
  * @param defaultUnitId Единица измерения по умолчанию.
  * @param units Допустимые единицы измерения.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CategoryParameterUnitDTO(
  defaultUnitId: Long,
  units: List[UnitDTO]
)

object CategoryParameterUnitDTO {
  implicit lazy val categoryParameterUnitDTOJsonFormat: Format[CategoryParameterUnitDTO] = Json.format[CategoryParameterUnitDTO]
}

