package model

import play.api.libs.json._

/**
  * Информация о заказах, которые повлияли на индекс качества.
  * @param affectedOrders Список заказов, которые повлияли на индекс качества.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class QualityRatingDetailsDTO(
  affectedOrders: List[QualityRatingAffectedOrderDTO]
)

object QualityRatingDetailsDTO {
  implicit lazy val qualityRatingDetailsDTOJsonFormat: Format[QualityRatingDetailsDTO] = Json.format[QualityRatingDetailsDTO]
}

