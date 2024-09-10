
package org.openapitools.client.model


case class DeleteHiddenOffersRequest (
    /* Список скрытых товаров.  */
    _hiddenOffers: List[HiddenOfferDTO]
)
object DeleteHiddenOffersRequest {
    def toStringBody(var_hiddenOffers: Object) =
        s"""
        | {
        | "hiddenOffers":$var_hiddenOffers
        | }
        """.stripMargin
}
