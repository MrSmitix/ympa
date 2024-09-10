package model

import play.api.libs.json._

/**
  * Информация о покупателе с базовыми полями.
  * @param id Идентификатор покупателя.
  * @param lastName Фамилия покупателя.
  * @param firstName Имя покупателя.
  * @param middleName Отчество покупателя.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderBuyerBasicInfoDTO(
  id: Option[String],
  lastName: Option[String],
  firstName: Option[String],
  middleName: Option[String],
  `type`: Option[OrderBuyerType]
)

object OrderBuyerBasicInfoDTO {
  implicit lazy val orderBuyerBasicInfoDTOJsonFormat: Format[OrderBuyerBasicInfoDTO] = Json.format[OrderBuyerBasicInfoDTO]
}

