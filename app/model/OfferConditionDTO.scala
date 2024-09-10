package model

import play.api.libs.json._

/**
  * Состояние уцененного товара. 
  * @param reason Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferConditionDTO(
  `type`: Option[OfferConditionType],
  quality: Option[OfferConditionQualityType],
  reason: Option[String]
)

object OfferConditionDTO {
  implicit lazy val offerConditionDTOJsonFormat: Format[OfferConditionDTO] = Json.format[OfferConditionDTO]
}

