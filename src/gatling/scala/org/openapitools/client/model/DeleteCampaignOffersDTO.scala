
package org.openapitools.client.model


case class DeleteCampaignOffersDTO (
    /* Список SKU. */
    _notDeletedOfferIds: Option[List[String]]
)
object DeleteCampaignOffersDTO {
    def toStringBody(var_notDeletedOfferIds: Object) =
        s"""
        | {
        | "notDeletedOfferIds":$var_notDeletedOfferIds
        | }
        """.stripMargin
}
