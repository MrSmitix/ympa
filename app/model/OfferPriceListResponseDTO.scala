package model

import play.api.libs.json._

/**
  * Список цен на товары.
  * @param offers Страница списка.
  * @param total Количество всех цен магазина, измененных через API.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferPriceListResponseDTO(
  offers: List[OfferPriceResponseDTO],
  paging: Option[ScrollingPagerDTO],
  total: Option[Int]
)

object OfferPriceListResponseDTO {
  implicit lazy val offerPriceListResponseDTOJsonFormat: Format[OfferPriceListResponseDTO] = Json.format[OfferPriceListResponseDTO]
}

