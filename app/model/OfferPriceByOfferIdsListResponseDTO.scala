package model

import play.api.libs.json._

/**
  * Список цен.
  * @param offers Страница списка цен.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferPriceByOfferIdsListResponseDTO(
  offers: List[OfferPriceByOfferIdsResponseDTO],
  paging: Option[ScrollingPagerDTO]
)

object OfferPriceByOfferIdsListResponseDTO {
  implicit lazy val offerPriceByOfferIdsListResponseDTOJsonFormat: Format[OfferPriceByOfferIdsListResponseDTO] = Json.format[OfferPriceByOfferIdsListResponseDTO]
}

