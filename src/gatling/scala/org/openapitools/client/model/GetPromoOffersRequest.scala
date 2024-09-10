
package org.openapitools.client.model


case class GetPromoOffersRequest (
    /* Идентификатор акции. */
    _promoId: String,
    _statusType: Option[PromoOfferParticipationStatusFilterType]
)
object GetPromoOffersRequest {
    def toStringBody(var_promoId: Object, var_statusType: Object) =
        s"""
        | {
        | "promoId":$var_promoId,"statusType":$var_statusType
        | }
        """.stripMargin
}
