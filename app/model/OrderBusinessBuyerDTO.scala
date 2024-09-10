package model

import play.api.libs.json._

/**
  * Информация о покупателе. 
  * @param inn ИНН.
  * @param kpp КПП.
  * @param organizationName Наименование юридического лица.
  * @param organizationJurAddress Юридический адрес.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderBusinessBuyerDTO(
  inn: Option[String],
  kpp: Option[String],
  organizationName: Option[String],
  organizationJurAddress: Option[String]
)

object OrderBusinessBuyerDTO {
  implicit lazy val orderBusinessBuyerDTOJsonFormat: Format[OrderBusinessBuyerDTO] = Json.format[OrderBusinessBuyerDTO]
}

