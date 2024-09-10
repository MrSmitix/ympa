
package org.openapitools.client.model


case class OfferCardsContentStatusDTO (
    /* Страница списка товаров с информацией о состоянии карточек. */
    _offerCards: List[OfferCardDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object OfferCardsContentStatusDTO {
    def toStringBody(var_offerCards: Object, var_paging: Object) =
        s"""
        | {
        | "offerCards":$var_offerCards,"paging":$var_paging
        | }
        """.stripMargin
}
