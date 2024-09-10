
package org.openapitools.client.model


case class UpdatePromoOffersRequest (
    /* Идентификатор акции. */
    _promoId: String,
    /* Товары, которые необходимо добавить в акцию или цены которых нужно изменить. */
    _offers: List[UpdatePromoOfferDTO]
)
object UpdatePromoOffersRequest {
    def toStringBody(var_promoId: Object, var_offers: Object) =
        s"""
        | {
        | "promoId":$var_promoId,"offers":$var_offers
        | }
        """.stripMargin
}
