
package org.openapitools.client.model


case class OfferRecommendationsResultDTO (
    _paging: Option[ScrollingPagerDTO],
    /* Страница списка товаров. */
    _offerRecommendations: List[OfferRecommendationDTO]
)
object OfferRecommendationsResultDTO {
    def toStringBody(var_paging: Object, var_offerRecommendations: Object) =
        s"""
        | {
        | "paging":$var_paging,"offerRecommendations":$var_offerRecommendations
        | }
        """.stripMargin
}
