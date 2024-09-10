package model

import play.api.libs.json._

/**
  * Информация о заказе, который повлиял на индекс качества.
  * @param orderId Идентификатор заказа.
  * @param description Описание проблемы.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class QualityRatingAffectedOrderDTO(
  orderId: Long,
  description: String,
  componentType: AffectedOrderQualityRatingComponentType
)

object QualityRatingAffectedOrderDTO {
  implicit lazy val qualityRatingAffectedOrderDTOJsonFormat: Format[QualityRatingAffectedOrderDTO] = Json.format[QualityRatingAffectedOrderDTO]
}

