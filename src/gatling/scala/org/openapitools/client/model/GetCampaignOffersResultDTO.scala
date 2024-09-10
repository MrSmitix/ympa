
package org.openapitools.client.model


case class GetCampaignOffersResultDTO (
    _paging: Option[ScrollingPagerDTO],
    /* Страница списка товаров. */
    _offers: List[GetCampaignOfferDTO]
)
object GetCampaignOffersResultDTO {
    def toStringBody(var_paging: Object, var_offers: Object) =
        s"""
        | {
        | "paging":$var_paging,"offers":$var_offers
        | }
        """.stripMargin
}
