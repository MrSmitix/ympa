package model

import play.api.libs.json._

/**
  * Идентификаторы, которые связаны с отзывом.
  * @param orderId Идентификатор заказа на Маркете.
  * @param modelId Идентификатор модели товара.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsFeedbackIdentifiersDTO(
  orderId: Long,
  modelId: Long
)

object GoodsFeedbackIdentifiersDTO {
  implicit lazy val goodsFeedbackIdentifiersDTOJsonFormat: Format[GoodsFeedbackIdentifiersDTO] = Json.format[GoodsFeedbackIdentifiersDTO]
}

