package model

import play.api.libs.json._

/**
  * Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class AffectedOrderQualityRatingComponentType(
)

object AffectedOrderQualityRatingComponentType {
  implicit lazy val affectedOrderQualityRatingComponentTypeJsonFormat: Format[AffectedOrderQualityRatingComponentType] = Json.format[AffectedOrderQualityRatingComponentType]
}

