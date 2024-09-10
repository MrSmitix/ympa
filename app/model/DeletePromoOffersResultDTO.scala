package model

import play.api.libs.json._

/**
  * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
  * @param rejectedOffers Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeletePromoOffersResultDTO(
  rejectedOffers: Option[List[RejectedPromoOfferDeleteDTO]]
)

object DeletePromoOffersResultDTO {
  implicit lazy val deletePromoOffersResultDTOJsonFormat: Format[DeletePromoOffersResultDTO] = Json.format[DeletePromoOffersResultDTO]
}

