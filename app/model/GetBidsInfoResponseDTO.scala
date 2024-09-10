package model

import play.api.libs.json._

/**
  * Список товаров с указанными ставками.
  * @param bids Страница списка товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetBidsInfoResponseDTO(
  bids: List[SkuBidItemDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object GetBidsInfoResponseDTO {
  implicit lazy val getBidsInfoResponseDTOJsonFormat: Format[GetBidsInfoResponseDTO] = Json.format[GetBidsInfoResponseDTO]
}

