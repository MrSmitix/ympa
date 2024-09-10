
package org.openapitools.client.model


case class DeletePromoOffersResultDTO (
    /* Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  */
    _rejectedOffers: Option[List[RejectedPromoOfferDeleteDTO]]
)
object DeletePromoOffersResultDTO {
    def toStringBody(var_rejectedOffers: Object) =
        s"""
        | {
        | "rejectedOffers":$var_rejectedOffers
        | }
        """.stripMargin
}
