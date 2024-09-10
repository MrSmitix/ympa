
package org.openapitools.client.model


case class UpdateCampaignOffersRequest (
    /* Параметры размещения товаров в заданном магазине. */
    _offers: List[UpdateCampaignOfferDTO]
)
object UpdateCampaignOffersRequest {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
