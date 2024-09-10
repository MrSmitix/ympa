package model

import play.api.libs.json._

/**
  * Логистическая информация по возврату.
  * @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
  * @param imei Международный идентификатор мобильного оборудования.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ReturnInstanceDTO(
  stockType: Option[ReturnInstanceStockType],
  status: Option[ReturnInstanceStatusType],
  cis: Option[String],
  imei: Option[String]
)

object ReturnInstanceDTO {
  implicit lazy val returnInstanceDTOJsonFormat: Format[ReturnInstanceDTO] = Json.format[ReturnInstanceDTO]
}

