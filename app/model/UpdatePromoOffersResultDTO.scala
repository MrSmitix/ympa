package model

import play.api.libs.json._

/**
  * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
  * @param rejectedOffers Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
  * @param warningOffers Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdatePromoOffersResultDTO(
  rejectedOffers: Option[List[RejectedPromoOfferUpdateDTO]],
  warningOffers: Option[List[WarningPromoOfferUpdateDTO]]
)

object UpdatePromoOffersResultDTO {
  implicit lazy val updatePromoOffersResultDTOJsonFormat: Format[UpdatePromoOffersResultDTO] = Json.format[UpdatePromoOffersResultDTO]
}

