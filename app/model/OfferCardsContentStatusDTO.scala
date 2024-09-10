package model

import play.api.libs.json._

/**
  * Список товаров с информацией о состоянии карточек.
  * @param offerCards Страница списка товаров с информацией о состоянии карточек.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferCardsContentStatusDTO(
  offerCards: List[OfferCardDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object OfferCardsContentStatusDTO {
  implicit lazy val offerCardsContentStatusDTOJsonFormat: Format[OfferCardsContentStatusDTO] = Json.format[OfferCardsContentStatusDTO]
}

