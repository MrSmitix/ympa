package model

import play.api.libs.json._

/**
  * Региональная информация.
  * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class RegionalModelInfoDTO(
  currency: Option[CurrencyType],
  regionId: Option[Long]
)

object RegionalModelInfoDTO {
  implicit lazy val regionalModelInfoDTOJsonFormat: Format[RegionalModelInfoDTO] = Json.format[RegionalModelInfoDTO]
}

