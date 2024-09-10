package model

import play.api.libs.json._

/**
  * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
  * @param campaignIds Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PromoOfferUpdateWarningDTO(
  code: PromoOfferUpdateWarningCodeType,
  campaignIds: Option[List[Long]]
)

object PromoOfferUpdateWarningDTO {
  implicit lazy val promoOfferUpdateWarningDTOJsonFormat: Format[PromoOfferUpdateWarningDTO] = Json.format[PromoOfferUpdateWarningDTO]
}

