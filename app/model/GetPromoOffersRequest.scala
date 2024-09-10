package model

import play.api.libs.json._

/**
  * Получение списка товаров, которые участвуют или могут участвовать в акции.
  * @param promoId Идентификатор акции.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPromoOffersRequest(
  promoId: String,
  statusType: Option[PromoOfferParticipationStatusFilterType]
)

object GetPromoOffersRequest {
  implicit lazy val getPromoOffersRequestJsonFormat: Format[GetPromoOffersRequest] = Json.format[GetPromoOffersRequest]
}

