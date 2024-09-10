package model

import play.api.libs.json._

/**
  * Список товаров, которые участвуют или могут участвовать в акции.
  * @param offers Товары, которые участвуют или могут участвовать в акции.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPromoOffersResultDTO(
  offers: List[GetPromoOfferDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object GetPromoOffersResultDTO {
  implicit lazy val getPromoOffersResultDTOJsonFormat: Format[GetPromoOffersResultDTO] = Json.format[GetPromoOffersResultDTO]
}

