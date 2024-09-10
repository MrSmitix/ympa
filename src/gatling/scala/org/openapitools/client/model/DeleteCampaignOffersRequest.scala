
package org.openapitools.client.model


case class DeleteCampaignOffersRequest (
    /* Идентификаторы товаров в каталоге. */
    _offerIds: List[String]
)
object DeleteCampaignOffersRequest {
    def toStringBody(var_offerIds: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds
        | }
        """.stripMargin
}
